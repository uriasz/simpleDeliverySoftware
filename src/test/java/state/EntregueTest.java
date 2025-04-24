package state;

import observer.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntregueTest {
    @Test
    void testSingleton() {
        Entregue instancia1 = Entregue.getInstancia();
        Entregue instancia2 = Entregue.getInstancia();

        assertSame(instancia1, instancia2);
    }

    @Test
    void testEstadoFinal() {
        Pedido pedido = new Pedido();
        Entregue estado = Entregue.getInstancia();

        estado.processarPedido(pedido);
        assertEquals("Entregue ao cliente", pedido.getEstado());
    }
}