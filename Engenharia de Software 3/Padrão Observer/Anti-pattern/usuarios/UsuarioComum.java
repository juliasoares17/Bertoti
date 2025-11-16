package padrao_observer.antipattern.usuarios;

public class UsuarioComum {

    private String nome;

    public UsuarioComum(String nome){
        this.nome = nome;
    };

    public void notificarComum(String titulo) {
        System.out.println("(Usuário Comum - " + nome + ") Nova notícia: " + titulo + "\n");
    };

}


