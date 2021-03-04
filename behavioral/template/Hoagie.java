package behavioral.template;

public abstract class Hoagie {
    // template method
    final void makeSandwich() {
        cutBun();
        if (customerWantsMeat()) {
            addMeat();
        }
        if (customerWantsCheese()) {
            addCheese();
        }
        if (customerWantsVegetables()) {
            addVegetables();
        }
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVegetables() {
        return true;
    }

    boolean customerWantsCondiments() {
        return true;
    }

    public void wrapTheHoagie() {
        System.out.println("Wrap the Hoagie");
    }

    public void cutBun() {
        System.out.println("The Hoagie is Cut");
    }
}
