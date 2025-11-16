package uniao_de_padroes.observer;

import java.util.Collections;
import java.util.Set;
import uniao_de_padroes.core.PlanoTreino;

public class Personal implements Observer{
    private String nome;

    public Personal(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(PlanoTreino plano) {
        System.out.println("[PERSONAL - " + nome + "] Seu aluno " 
            + plano.getNomeAluno() + " recebeu um novo treino!");
    }

    @Override
    public Set<String> getTiposAssinados() {
        return Collections.emptySet();
    }

    @Override
    public boolean isPremium() {
        return false;
    }

    @Override
    public boolean isPersonal() {
        return true;
    }
}
