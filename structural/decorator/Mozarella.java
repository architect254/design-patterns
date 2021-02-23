package structural.decorator;

public class Mozarella extends ToppingDecorator {

    public Mozarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost() {
        return tempPizza.getCost() + .50;
    }

}
