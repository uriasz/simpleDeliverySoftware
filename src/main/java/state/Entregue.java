package state;

import observer.Pedido;

public class Entregue implements EstadoPedido {
    private static final Entregue instancia = new Entregue();

    private Entregue() {}

    public static Entregue getInstancia() {
        return instancia;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        pedido.setEstado("Entregue ao cliente");
    }
}