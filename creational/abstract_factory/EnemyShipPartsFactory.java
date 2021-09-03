package creational.abstract_factory;

public interface EnemyShipPartsFactory {
    public EnemyShipWeapon createEnemyShipWeapon();

    public EnemyShipEngine createEnemyShipEngine();
}
