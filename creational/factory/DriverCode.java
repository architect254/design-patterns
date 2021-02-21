package creational.factory;

import java.util.Scanner;

// used to create a method that dynamically return one of several objects
// sharing the same superclass

public class DriverCode {
    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            userInput.close();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy != null) {
            doStuffEnemyShip(theEnemy);
        } else {
            System.out.println("Wrong Choice");
        }
    }

    public static void doStuffEnemyShip(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}