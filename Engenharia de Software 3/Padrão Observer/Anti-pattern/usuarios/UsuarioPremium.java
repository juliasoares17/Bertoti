public class UsuarioPremium {
    
    private String nome;

    public UsuarioPremium(String nome){
        this.nome = nome;
    };

    public void notificarPremium(String titulo, String conteudo){
        System.out.println("(Usuário Premium - " + nome + ") Nova notícia: " + titulo);
        System.out.println("    Título: " + titulo);
        System.out.println("    Conteúdo: " + conteudo + "\n");
    };

}

