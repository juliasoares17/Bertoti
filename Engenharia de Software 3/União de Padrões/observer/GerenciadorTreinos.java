package uniao_de_padroes.observer;

import java.util.ArrayList;
import java.util.List;
import uniao_de_padroes.core.PlanoTreino;

public class GerenciadorTreinos {

    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public void notificar(PlanoTreino plano) {
        for (Observer obs : observers) {

            if (obs.isPersonal()) {
                obs.atualizar(plano);
                continue;
            }

            if (obs.isPremium()) {
                obs.atualizar(plano);
                continue;
            }

            if (obs.getTiposAssinados().contains(plano.getTipo())) {
                obs.atualizar(plano);
            }
        }
    }
}


