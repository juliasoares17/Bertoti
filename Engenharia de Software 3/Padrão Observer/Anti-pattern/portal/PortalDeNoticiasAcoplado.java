package padrao_observer.antipattern.portal;

import padrao_observer.antipattern.usuarios.UsuarioComum;
import padrao_observer.antipattern.usuarios.UsuarioPremium;

public class PortalDeNoticiasAcoplado {

    private UsuarioComum usuarioComum;
    private UsuarioPremium usuarioPremium;

    public void setUsuarioComum(UsuarioComum u){
        this.usuarioComum = u;
    };

    public void setUsuarioPremium(UsuarioPremium u){
        this.usuarioPremium = u;
    };

    public void publicarNoticia(String titulo, String conteudo){
        System.out.println("Nova notícia publicada: " + titulo + "\n");

        if (usuarioComum != null){
            usuarioComum.notificarComum(titulo);
        };

        if (usuarioPremium != null) {
            usuarioPremium.notificarPremium(titulo, conteudo);
        };

    };
    
}


