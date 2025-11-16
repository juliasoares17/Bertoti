import uniao_de_padroes.core.PlanoTreino;

public class TreinoHipermetrofia implements TreinoStrategy {
    @Override
    public PlanoTreino gerarTreino(String nome, int idade, double peso, double altura) {
        return new PlanoTreino(
            nome,
            "Treino de Hipertrofia",
            "Séries pesadas, baixa repetição, foco em força."
        );
    }
}

