package behavioral.visitor;

public abstract class Item {
    private double price;

    Item(double itemPrice) {
        price = itemPrice;
    }

    public double getPrice() {
        return price;
    }
}
