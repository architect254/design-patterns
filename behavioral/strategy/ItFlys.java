package behavioral.strategy;

//concrete implementation of flying ability
public class ItFlys implements Flys {

    @Override
    public String fly() {

        return "is Flying";
    }

}
