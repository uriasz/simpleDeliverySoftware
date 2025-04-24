package state;

import observer.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmRotaTest {
    @Test
    void testSingleton() {
        EmRota instancia1 = EmRota.getInstancia();
        EmRota instancia2 = EmRota.getInstancia();

        assertSame(instancia1, instancia2);
    }

    @Test
    void testMudancaParaEntregue() {
        Pedido pedido = new Pedido();
        EmRota estado = EmRota.getInstancia();

        estado.processarPedido(pedido);
        assertEquals("Em rota de entrega", pedido.getEstado());
    }
}