package behavioral.visitor;

public class Tobacco extends Item implements Visitable {

    Tobacco(double itemPrice) {
        super(itemPrice);

    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

}