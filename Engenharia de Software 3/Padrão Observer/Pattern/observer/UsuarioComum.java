public class UsuarioComum implements Observer {

    private String nome;

    public UsuarioComum(String nome) {
        this.nome = nome;
    };

    @Override
    public void update(String titulo, String conteudo) {
        System.out.println("(Usuário Comum - " + nome + ") Nova notícia: " + titulo + "\n");
    };
    
}

