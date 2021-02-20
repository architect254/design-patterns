package behavioral.strategy;

//concrete implementation of animal with flying ability
public class Bird extends Animal {
    public Bird() {
        this.flyingType = new ItFlys();
    }
}
