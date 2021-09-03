package creational.abstract_factory;

public class UFOEnemyShipPartsFactory implements EnemyShipPartsFactory {

    @Override
    public EnemyShipWeapon createEnemyShipWeapon() {

        return new EnemyShipUFOGun();
    }

    @Override
    public EnemyShipEngine createEnemyShipEngine() {

        return new EnemyShipUFOEngine();
    }

}