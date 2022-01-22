package behavioral.visitor;

public class Liquor extends Item implements Visitable {

    Liquor(double itemPrice) {
        super(itemPrice);

    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
