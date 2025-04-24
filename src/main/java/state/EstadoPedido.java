package state;

import observer.Pedido;

public interface EstadoPedido {
    void processarPedido(Pedido pedido);
}