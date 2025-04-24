package state;

import observer.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmPreparacaoTest {
    @Test
    void testSingleton() {
        EmPreparacao instancia1 = EmPreparacao.getInstancia();
        EmPreparacao instancia2 = EmPreparacao.getInstancia();

        assertSame(instancia1, instancia2); // Singleton deve garantir mesma instância
    }

    @Test
    void testMudancaParaEmRota() {
        Pedido pedido = new Pedido();
        EmPreparacao estado = EmPreparacao.getInstancia();

        estado.processarPedido(pedido);
        assertEquals("Em preparação", pedido.getEstado());
    }
}