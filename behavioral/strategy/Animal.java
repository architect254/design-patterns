package behavioral.strategy;

// animal super class that specifies a dynamic flying type attribute and a method to dynamically set the ability and also one for flying
public class Animal {

    Flys flyingType;

    public void setFlyingType(Flys newFlyingType) {
        this.flyingType = newFlyingType;

    }

    public String tryToFly() {
        return this.flyingType.fly();
    }

}
