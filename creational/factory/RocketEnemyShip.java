package creational.factory;

// implementation of common superclass
public class RocketEnemyShip extends EnemyShip {
    public RocketEnemyShip() {
        this.setName("Rocket enemy Ship");
        this.setDamage(150);
    }
}