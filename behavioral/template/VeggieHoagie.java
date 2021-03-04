package behavioral.template;

public class VeggieHoagie extends Hoagie {
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions" };
    String[] condimentsUsed = { " Oil", "Vinegar", };

    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVegetables() {
        System.out.println("Adding the Veggies");
        for (String veggie : veggiesUsed) {
            System.out.print(veggie + " ");
        }

    }

    @Override
    void addCondiments() {
        System.out.println("Adding the Condiments");
        for (String condiment : condimentsUsed) {
            System.out.print(condiment + " ");
        }
    }

    boolean customerWantsMeat() {
        return false;
    }

    boolean customerWantsCheese() {
        return false;
    }

}
