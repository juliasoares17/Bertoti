import padrao_observer.antipattern.usuarios.UsuarioComum;
import padrao_observer.antipattern.usuarios.UsuarioPremium;
import padrao_observer.antipattern.portal.PortalDeNoticiasAcoplado;

public class Main {
    public static void main(String[] args) {

        PortalDeNoticiasAcoplado portal = new PortalDeNoticiasAcoplado();

        UsuarioComum user1 = new UsuarioComum("José");
        UsuarioPremium user2 = new UsuarioPremium("Catarina");

        portal.setUsuarioComum(user1);
        portal.setUsuarioPremium(user2);

        portal.publicarNoticia(
            "Cometa raro passa pela Terra", 
            "O fenômeno será visível durante toda a madrugada.");

        System.out.println("--- Usuário comum foi removido (de forma menos sofisticada) --- \n");
        portal.setUsuarioComum(null);

        portal.publicarNoticia(
            "Descoberto novo material supercondutor", 
            "Cientistas afirmam que ele funciona à temperatura ambiente.");

    };
}

