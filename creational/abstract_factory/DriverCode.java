package creational.abstract_factory;

// it is like factory but everything is encapsulated
// final objects contain objects that use Stratey Pattern (composition)
// allows creation of families of related objects without specifying a concrete class
public class DriverCode {
    public static void main(String[] args) {
        EnemyShipBuilding shipBuilding = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = shipBuilding.orderTheShip("BOSS");

        System.out.println(theGrunt + "\n");

        doStuffEnemyShip(theGrunt);
    }

    public static void doStuffEnemyShip(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
