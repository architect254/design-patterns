package structural.decorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tomato Sauce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Souce";
    }

    public double getCost() {
        return tempPizza.getCost() + .25 ;
    }

}
