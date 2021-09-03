package creational.abstract_factory;

public abstract class EnemyShipBuilding {
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        
        theEnemyShip.makeEnemyShip();
        return theEnemyShip;
    }
}
