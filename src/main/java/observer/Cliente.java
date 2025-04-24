package observer;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observer {
    private String nome;
    private List<String> notificacoes = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String estado) {
        notificacoes.add("O pedido agora está '" + estado + "'.");
    }

    public List<String> getNotificacoes() {
        return notificacoes;
    }
}