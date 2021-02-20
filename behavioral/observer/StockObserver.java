package behavioral.observer;

// concrete implementation of Observer
public class StockObserver implements Observer {
    StockData data;
    static int observerIDTracker = 0;
    int observerID;

    public StockObserver() {
        this.data = new StockData(0.0, 0.0, 0.0);
        this.observerID = ++observerIDTracker;
        System.out.println("\nNew Observer " + observerID + " Created");
    }

    @Override
    public void update(StockData newData) {
        this.data = newData;
        System.out.println("\nObserver " + this.observerID + " state");
        System.out.println("  IBM: " + this.data.ibmPrice);
        System.out.println("APPLE: " + this.data.aaplPrice);
        System.out.println("GOOGLE: " + this.data.googlPrice);

    }
}
