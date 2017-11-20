package ObserverPattern;

public class StockCenter {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver appl = new StockObserver(stockGrabber, "APPL");
        StockObserver goog = new StockObserver(stockGrabber, "GOOG");
        StockObserver fb = new StockObserver(stockGrabber, "FB");

        stockGrabber.notifyObservers(appl, 100);
        stockGrabber.notifyObservers(goog, 200);
        stockGrabber.notifyObservers(fb, 300);
        stockGrabber.notifyObservers(appl, 150);
    }
}
