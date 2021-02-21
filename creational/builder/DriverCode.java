package creational.builder;

// used to create objects made from a bunch of other objects
// when you want the creation of these parts to be independent of main object
// hide the creation of the parts from the client so both arent dependent
// the builder knows the specifics and nobody else does
public class DriverCode {
    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(oldStyleRobot);
        engineer.makeRobot();
        Robot robot = engineer.getRobot();

        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + robot.getHead());
        System.out.println("Robot Torso Type: " + robot.getTorso());
        System.out.println("Robot Arms Type: " + robot.getArms());
        System.out.println("Robot Legs Type: " + robot.getLegs());
    }
}
