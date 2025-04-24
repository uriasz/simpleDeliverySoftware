package factory;

import observer.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoFactoryTest {
    @Test
    void testCriarPedido() {
        PedidoFactory factory = new PedidoFactoryImpl();
        Pedido pedido = factory.criarPedido();

        assertNotNull(pedido);
        assertEquals("Em preparação", pedido.getEstado());
    }
}