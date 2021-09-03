package creational.abstract_factory;

public class UFOEnemyShip extends EnemyShip {
    EnemyShipPartsFactory shipPartsFactory;

    public UFOEnemyShip(EnemyShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public void makeEnemyShip() {
        System.out.println("Making enemy ship " + this.getName());
        this.weapon = this.shipPartsFactory.createEnemyShipWeapon();
        this.engine = this.shipPartsFactory.createEnemyShipEngine();

    }

}
