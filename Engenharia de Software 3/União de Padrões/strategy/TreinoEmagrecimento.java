import uniao_de_padroes.core.PlanoTreino;

public class TreinoEmagrecimento implements TreinoStrategy {
    @Override
    public PlanoTreino gerarTreino(String nome, int idade, double peso, double altura) {
        return new PlanoTreino(
            nome,
            "Treino para Emagrecimento",
            "Circuitos rápidos, alta repetição, foco em gasto calórico."
        );
    }
}

