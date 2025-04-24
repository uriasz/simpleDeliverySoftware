package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void testReceberNotificacao() {
        Cliente cliente = new Cliente("Carlos");
        cliente.atualizar("Em preparação");

        assertEquals(1, cliente.getNotificacoes().size());
        assertEquals("O pedido agora está 'Em preparação'.", cliente.getNotificacoes().get(0));
    }
}