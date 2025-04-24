package state;

import observer.Pedido;

public class EmRota implements EstadoPedido {
    private static final EmRota instancia = new EmRota();

    private EmRota() {}

    public static EmRota getInstancia() {
        return instancia;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        pedido.setEstado("Em rota de entrega");
        pedido.setEstado(Entregue.getInstancia().toString());
    }
}