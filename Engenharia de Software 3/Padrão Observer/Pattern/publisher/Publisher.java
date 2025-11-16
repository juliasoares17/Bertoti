import padrao_observer.pattern.observer.Observer;

public interface Publisher {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String titulo, String conteudo);    
}

