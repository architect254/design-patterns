package behavioral.strategy;

//concrete implementation of no flying ability
public class CantFly implements Flys {

    @Override
    public String fly() {

        return "cant Fly";
    }

}
