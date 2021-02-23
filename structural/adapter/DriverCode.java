package structural.adapter;

// allows 2 interfaces to work together
// used when client expects a (target) interface
// The adapter class allows the use of the available interface and the target interface
// Any class can work together as long as the Adapter solves the issue that all classes 
// must implement every method defined by the shared interface
public class DriverCode {
    public static void main(String[] args) {
        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot p7Robot = new EnemyRobot();

        EnemyAttacker robotAttacker = new EnemyRobotAdapter(p7Robot);

        System.out.println("The Robot");

        p7Robot.reactToHuman("Paul");
        p7Robot.walkForward();
        p7Robot.smashWithHands();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The Robit with Adapter");

        robotAttacker.assignDriver("Frank");
        robotAttacker.driveForward();
        robotAttacker.fireWeapon();

    }

}
