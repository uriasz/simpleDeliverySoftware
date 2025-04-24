package observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Observer> clientes = new ArrayList<>();
    private String estado;

    public void adicionarObserver(Observer cliente) {
        clientes.add(cliente);
    }

    public void removerObserver(Observer cliente) {
        clientes.remove(cliente);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarClientes();
    }

    private void notificarClientes() {
        for (Observer cliente : clientes) {
            cliente.atualizar(estado);
        }
    }

    public String getEstado() {
        return estado;
    }
}