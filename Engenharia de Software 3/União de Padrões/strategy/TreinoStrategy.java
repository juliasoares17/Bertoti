package uniao_de_padroes.strategy;

import uniao_de_padroes.core.PlanoTreino;

public interface TreinoStrategy {
    PlanoTreino gerarTreino(String nomeAluno, int idade, double peso, double altura);
}
