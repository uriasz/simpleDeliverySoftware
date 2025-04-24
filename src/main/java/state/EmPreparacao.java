package state;

import observer.Pedido;

public class EmPreparacao implements EstadoPedido {
    private static final EmPreparacao instancia = new EmPreparacao();

    private EmPreparacao() {} // Construtor privado

    public static EmPreparacao getInstancia() {
        return instancia;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        pedido.setEstado("Em preparação");
        pedido.setEstado(EmRota.getInstancia().toString());
    }
}