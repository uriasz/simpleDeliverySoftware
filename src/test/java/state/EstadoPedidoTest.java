package state;

import observer.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadoPedidoTest {
    @Test
    void testMudancaDeEstado() {
        Pedido pedido = new Pedido();
        pedido.setEstado("Em preparação");

        assertEquals("Em preparação", pedido.getEstado());

        pedido.setEstado("Em rota");
        assertEquals("Em rota", pedido.getEstado());
    }
}