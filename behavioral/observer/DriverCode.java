package behavioral.observer;
// Used when you need many other objects to receive an update when another object changes

// enables loose coupling
// negatives the subject(publisher) may send updates that dont matter to the observer(subscriber)
// the subject(publisher) doesnt need to know about the observers(subscribers)
// the subject maintains a list of its dependents called observers and notifies them automatically of any state changes usually by calling one of their methods

// eg stockmarket with thousands of stocks needs to send updates to objects representing individual stocks
// the subject(publisher) sends many stocks to the observers
// the observers(subscribers) takes the ones they want and use them.
public class DriverCode {
    public static void main(String[] args) {
        StockSubject stockSubject = new StockSubject();

        StockObserver stockObserver1 = new StockObserver();
        stockSubject.register(stockObserver1);

        stockSubject.setData(new StockData(197, 56, 100));

        StockObserver stockObserver2 = new StockObserver();
        stockSubject.register(stockObserver2);

        stockSubject.setData(new StockData(120, 87, 87));
    }
}
