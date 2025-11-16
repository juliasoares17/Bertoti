package uniao_de_padroes.strategy;

import uniao_de_padroes.core.PlanoTreino;

public class TreinoFlexibilidade implements TreinoStrategy {
    @Override
    public PlanoTreino gerarTreino(String nome, int idade, double peso, double altura) {
        return new PlanoTreino(
            nome,
            "Treino de flexibilidade",
            "Alongamentos e yoga."
        );
    }
}
