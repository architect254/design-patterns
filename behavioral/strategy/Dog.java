package behavioral.strategy;

//concrete implementation of animal without flying ability
public class Dog extends Animal {
    public Dog() {
        this.flyingType = new CantFly();
    }
}
