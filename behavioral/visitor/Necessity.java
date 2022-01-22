package behavioral.visitor;

public class Necessity extends Item implements Visitable {

    Necessity(double itemPrice) {
        super(itemPrice);

    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

}