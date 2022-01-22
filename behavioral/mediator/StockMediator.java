package behavioral.mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues = new ArrayList<>();
    private ArrayList<StockOffer> stockBuyOffers = new ArrayList<>();
    private ArrayList<StockOffer> stockSaleOffers = new ArrayList<>();

    private int colleagueCodes = 0;

    @Override
    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCodes++;
        newColleague.setColleagueCode(colleagueCodes);

    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;

        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStock() == stock) && (offer.getShares() == shares)) {
                System.out.println(
                        shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;

            }
            if (stockSold) {
                break;
            }
        }
        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to inventory");

            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);

            stockSaleOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;

        for (StockOffer offer : stockSaleOffers) {
            if ((offer.getStock() == stock) && (offer.getShares() == shares)) {
                System.out.println(
                        shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());
                stockSaleOffers.remove(offer);
                stockBought = true;

            }
            if (stockBought) {
                break;
            }
        }
        if (!stockBought) {
            System.out.println(shares + " share of " + stock + " added to inventory");

            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);

            stockBuyOffers.add(newOffering);
        }

    }

    public void getStockOfferings() {
        System.out.println("\nStocks on Sales Offer");

        for (StockOffer offer : stockSaleOffers) {
            System.out.println(offer.getShares() + " of " + offer.getStock());
        }
        System.out.println("\nStocks on Buy Offers");

        for (StockOffer offer : stockBuyOffers) {
            System.out.println(offer.getShares() + " of " + offer.getStock());
        }
    }

}
