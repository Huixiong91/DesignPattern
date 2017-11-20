package ObserverPattern;

public class StockObserver implements Observer {
    int price;
    String stockName;

    public StockObserver(Subject s, String stockName) {
        s.register(this);
        this.stockName = stockName;
    }

    @Override
    public void update(int price) {
        this.price = price;
        System.out.println(stockName + " price updated: " + price);
    }

}
