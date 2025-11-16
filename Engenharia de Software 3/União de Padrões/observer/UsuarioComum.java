import java.util.Set;
import uniao_de_padroes.core.PlanoTreino;

public class UsuarioComum implements Observer{
    private String nome;
    private Set<String> assinaturas;

    public UsuarioComum(String nome, Set<String> assinaturas) {
        this.nome = nome;
        this.assinaturas = assinaturas;
    }

    @Override
    public void atualizar(PlanoTreino plano) {
        System.out.println("[Usuário Comum - " + nome + "] Novo treino: " + plano.getTipo());
    }

    @Override
    public Set<String> getTiposAssinados() {
        return assinaturas;
    }

    @Override
    public boolean isPremium() {
        return false;
    }

    @Override
    public boolean isPersonal() {
        return false;
    }
}

