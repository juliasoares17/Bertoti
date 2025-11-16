package uniao_de_padroes;

import java.util.Set;

import uniao_de_padroes.core.PlanoTreino;
import uniao_de_padroes.strategy.*;
import uniao_de_padroes.observer.*;

public class Main {
    public static void main(String[] args) {

        GerenciadorTreinos gerenciador = new GerenciadorTreinos();

        UsuarioComum usuario1 = new UsuarioComum("Ana", Set.of("Treino de Hipertrofia"));
        UsuarioComum usuario2 = new UsuarioComum("Lucas", Set.of("Treino para Emagrecimento"));

        UsuarioPremium premium = new UsuarioPremium("Marcos");
        Personal personal = new Personal("Carlos");

        gerenciador.adicionarObserver(usuario1);
        gerenciador.adicionarObserver(usuario2);
        gerenciador.adicionarObserver(premium);
        gerenciador.adicionarObserver(personal);

        TreinoStrategy hipertrofia = new TreinoHipermetrofia();
        TreinoStrategy emagrecimento = new TreinoEmagrecimento();
        TreinoStrategy flexibilidade = new TreinoFlexibilidade();

        System.out.println("\n=== GERANDO TREINO DE HIPERTROFIA ===\n");
        PlanoTreino plano1 = hipertrofia.gerarTreino("João", 25, 72.0, 1.78);
        gerenciador.notificar(plano1);

        System.out.println("\n=== GERANDO TREINO DE EMAGRECIMENTO ===\n");
        PlanoTreino plano2 = emagrecimento.gerarTreino("Maria", 30, 85.0, 1.65);
        gerenciador.notificar(plano2);

        System.out.println("\n=== GERANDO TREINO DE FLEXIBILIDADE ===\n");
        PlanoTreino plano3 = flexibilidade.gerarTreino("João", 25, 72.0, 1.78);
        gerenciador.notificar(plano3);
    }
}
