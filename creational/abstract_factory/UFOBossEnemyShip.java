package creational.abstract_factory;

public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipPartsFactory shipPartsFactory;

    public UFOBossEnemyShip(EnemyShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public void makeEnemyShip() {
        System.out.println("Making Boss enemy ship " + this.getName());
        this.weapon = this.shipPartsFactory.createEnemyShipWeapon();
        this.engine = this.shipPartsFactory.createEnemyShipEngine();

    }

}