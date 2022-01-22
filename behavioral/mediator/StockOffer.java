package behavioral.mediator;

public class StockOffer {
    private int shares;
    private String stock;
    private int colleagueCode;

    public StockOffer(int numOfShares, String newStock, int newColleagueCode) {
        stock = newStock;
        shares = numOfShares;
        colleagueCode = newColleagueCode;
    }

    public int getShares() {
        return shares;
    }

    public String getStock() {
        return stock;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }

}
