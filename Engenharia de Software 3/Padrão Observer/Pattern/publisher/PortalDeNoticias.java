package padrao_observer.pattern.publisher;

import padrao_observer.pattern.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class PortalDeNoticias implements Publisher {
    
    private List<Observer> observers = new ArrayList<>();

    public void publicarNoticia(String titulo, String conteudo) {
        System.out.println("Nova notícia publicada: " + titulo + "\n");
        notifyObservers(titulo, conteudo);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String titulo, String conteudo){
        for (Observer o : observers) {
            o.update(titulo, conteudo);
        }
    }

}
