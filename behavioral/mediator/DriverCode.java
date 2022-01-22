package behavioral.mediator;

// it is used to handle communication between related objects(colleagues)
// all communication is handled by the mediator and the colleagues dont need to know anything about each other
// GOF: allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other
//      allows for the actions of each object in a set to vary independently of one another
public class DriverCode {
    public static void main(String[] args) {
        StockMediator nse = new StockMediator();

        GormanSlacks broker1 = new GormanSlacks(nse);
        JTPoorman broker2 = new JTPoorman(nse);

        broker1.saleOffer("MSFT", 100);
        broker1.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker1.buyOffer("NRG", 10);
        nse.getStockOfferings();
    }
}
