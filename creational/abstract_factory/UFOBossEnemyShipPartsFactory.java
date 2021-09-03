package creational.abstract_factory;

public class UFOBossEnemyShipPartsFactory implements EnemyShipPartsFactory {

    @Override
    public EnemyShipWeapon createEnemyShipWeapon() {

        return new EnemyShipBossUFOGun();
    }

    @Override
    public EnemyShipEngine createEnemyShipEngine() {

        return new EnemyShipBossUFOEngine();
    }

}
