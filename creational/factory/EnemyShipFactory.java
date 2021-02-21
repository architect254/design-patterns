package creational.factory;

// factory that is responsible for creating ships dynamically 
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipType) {

        switch (shipType) {
            case "U":
                return new UFOEnemyShip();

            case "B":
                return new BigUFOEnemyShip();

            case "R":
                return new RocketEnemyShip();

            default:
                return null;
        }
    }
}
