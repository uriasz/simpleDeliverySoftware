package factory;

import observer.Pedido;
import state.EmPreparacao;

public class PedidoFactoryImpl implements PedidoFactory {
    @Override
    public Pedido criarPedido() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EmPreparacao.getInstancia().toString());
        return pedido;
    }
}