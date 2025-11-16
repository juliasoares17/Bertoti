package uniao_de_padroes.observer;

import java.util.Collections;
import java.util.Set;
import uniao_de_padroes.core.PlanoTreino;

public class UsuarioPremium implements Observer{
    private String nome;

    public UsuarioPremium(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(PlanoTreino plano) {
        System.out.println("[Usuário PREMIUM - " + nome + "] Novo treino disponível: " + plano.getTipo());
    }

    @Override
    public Set<String> getTiposAssinados() {
        return Collections.singleton("*");
    }

    @Override
    public boolean isPremium() {
        return true;
    }

    @Override
    public boolean isPersonal() {
        return false;
    }
}
