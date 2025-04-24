import observer.Cliente;
import observer.Pedido;
import factory.PedidoFactory;
import factory.PedidoFactoryImpl;
import state.EmPreparacao;

public class Main {
    public static void main(String[] args) {
        // Criando pedido usando Factory Method
        PedidoFactory factory = new PedidoFactoryImpl();
        Pedido pedido = factory.criarPedido();

        // Criando clientes
        Cliente cliente1 = new Cliente("Carlos");
        Cliente cliente2 = new Cliente("Ana");

        // Adicionando clientes ao pedido
        pedido.adicionarObserver(cliente1);
        pedido.adicionarObserver(cliente2);

        // Processando pedido
        pedido.setEstado("Em preparação");
        pedido.setEstado("Em rota");
        pedido.setEstado("Entregue");

        // Obtendo notificações
        System.out.println(cliente1.getNotificacoes());
        System.out.println(cliente2.getNotificacoes());
    }
}