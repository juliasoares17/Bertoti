public class UsuarioPremium implements Observer {
    
    private String nome;

    public UsuarioPremium(String nome) {
        this.nome = nome;
    };

    @Override
    public void update(String titulo, String conteudo) {
        System.out.println("(Usuário Premium - " + nome + ") Nova notícia:");
        System.out.println("    Título: " + titulo);
        System.out.println("    Conteúdo: " + conteudo + "\n");
    };
}

