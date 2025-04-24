package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    @Test
    void testAdicionarRemoverObserver() {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Ana");

        pedido.adicionarObserver(cliente);
        pedido.setEstado("Em rota");

        assertEquals(1, cliente.getNotificacoes().size());

        pedido.removerObserver(cliente);
        pedido.setEstado("Entregue");

        assertEquals(1, cliente.getNotificacoes().size()); // Cliente não deve receber mais notificações
    }
}