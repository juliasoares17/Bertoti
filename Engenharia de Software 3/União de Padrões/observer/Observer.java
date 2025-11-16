package uniao_de_padroes.observer;

import java.util.Set;
import uniao_de_padroes.core.PlanoTreino;

public interface Observer {
    void atualizar(PlanoTreino plano);

    Set<String> getTiposAssinados();

    boolean isPremium();

    boolean isPersonal();
}

