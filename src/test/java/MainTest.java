import observer.Cliente;
import observer.Pedido;
import factory.PedidoFactory;
import factory.PedidoFactoryImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testFluxoCompleto() {
        PedidoFactory factory = new PedidoFactoryImpl();
        Pedido pedido = factory.criarPedido();

        Cliente cliente = new Cliente("Teste");
        pedido.adicionarObserver(cliente);

        pedido.setEstado("Em preparação");
        pedido.setEstado("Em rota");
        pedido.setEstado("Entregue");

        assertEquals(3, cliente.getNotificacoes().size());
    }
}