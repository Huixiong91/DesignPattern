package ObserverPattern;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(Observer target, int price);
}
