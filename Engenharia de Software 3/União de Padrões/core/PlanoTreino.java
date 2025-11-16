package uniao_de_padroes.core;

public class PlanoTreino {
    private String nomeAluno;
    private String tipo;
    private String descricao;

    public PlanoTreino(String nomeAluno, String tipo, String descricao) {
        this.nomeAluno = nomeAluno;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}


