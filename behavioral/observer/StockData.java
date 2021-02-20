package behavioral.observer;

// implementation of data to be updated ins stocks
public class StockData {
    double aaplPrice, googlPrice, ibmPrice;

    public StockData(double aaplPrice, double googlPrice, double ibmPrice) {
        this.aaplPrice = aaplPrice;
        this.googlPrice = googlPrice;
        this.ibmPrice = ibmPrice;
    }
}
