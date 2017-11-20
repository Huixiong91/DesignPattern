package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers(Observer target, int price) {
        for (Observer o : observers) {
            if (o == target) o.update(price);
        }
    }
}
