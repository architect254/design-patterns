package behavioral.mediator;

public interface Mediator {
    void addColleague(Colleague newColleague);

    void saleOffer(String stock, int shares, int colleagueCode);

    void buyOffer(String stock, int shares, int colleagueCode);

}
