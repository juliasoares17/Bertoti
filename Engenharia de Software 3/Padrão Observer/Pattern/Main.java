package padrao_observer.pattern;

import padrao_observer.pattern.publisher.PortalDeNoticias;
import padrao_observer.pattern.observer.UsuarioComum;
import padrao_observer.pattern.observer.UsuarioPremium;

public class Main {
    public static void main(String[] args) {
        PortalDeNoticias portal = new PortalDeNoticias();

        UsuarioComum user1 = new UsuarioComum("Carlos");
        UsuarioPremium user2 = new UsuarioPremium("Ana Clara");

        portal.addObserver(user1);
        portal.addObserver(user2);

        portal.publicarNoticia(
            "Novo satélite espacial é lançado", 
            "A agência espacial internacional enviou ao espaço um novo satélite capaz de captar imagens em altíssima resolução.");

        System.out.println("--- A partir daqui o usuário comum não está mais inscrito --- \n");

        portal.publicarNoticia(
            "Mercado de tecnologia cresce 12%",
            "Relatório aponta alta significativa nos investimentos em IA, robótica e computação em nuvem.");

    }
};