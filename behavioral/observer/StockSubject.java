package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// a concrete type that can observe stocks and be observed for stocks
public class StockSubject implements Subject {
    private StockData data = new StockData(0, 0, 0);
    private List<Observer> stockObservers;

    public StockSubject() {
        this.stockObservers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : stockObservers) {
            observer.update(this.data);
        }
    }

    @Override
    public void register(Observer newObserver) {
        this.stockObservers.add(newObserver);

    }

    @Override
    public void unregister(Observer unregisterObserver) {
        int observerId = this.stockObservers.indexOf(unregisterObserver);
        this.stockObservers.remove(observerId);
        System.out.println("Observer ID " + observerId + " unregistered");
    }

    public void setData(StockData data) {
        this.data = data;
        this.notifyObservers();
    }

}
