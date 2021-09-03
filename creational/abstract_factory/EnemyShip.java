package creational.abstract_factory;

// common superclass
public abstract class EnemyShip {

    String name;

    EnemyShipWeapon weapon;
    EnemyShipEngine engine;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeEnemyShip();

    public String toString() {
        return "The" + this.getName() + " has a top speed of " + this.engine + " and an attack power of " + this.weapon;
    }

    public void followHeroShip() {
        System.out.println(this.getName() + " is following the hero at " + this.engine);
    }

    public void displayEnemyShip() {
        System.out.println(this.getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(this.getName() + " attacks and does " + this.weapon);
    }

}
