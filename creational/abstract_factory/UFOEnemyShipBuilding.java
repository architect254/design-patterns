package creational.abstract_factory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip enemyShip = null;

        switch (typeOfShip) {
            case "UFO":
                EnemyShipPartsFactory shipPartsFactory = new UFOEnemyShipPartsFactory();
                enemyShip = new UFOEnemyShip(shipPartsFactory);
                enemyShip.setName("UFO Ship");
                break;
            case "BOSS":
                EnemyShipPartsFactory UFOBossEnemyShipParts = new UFOBossEnemyShipPartsFactory();
                enemyShip = new UFOBossEnemyShip(UFOBossEnemyShipParts);
                enemyShip.setName("UFO Boss Ship");
                break;

            default:
                break;
        }
        return enemyShip;
    }
}
