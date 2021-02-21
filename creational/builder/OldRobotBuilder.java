package creational.builder;

public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        this.robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildTorso() {
        this.robot.setRobotTorso("Tin Torso");

    }

    @Override
    public void buildArms() {
        this.robot.setRobotArms("Blowtorch Arms");

    }

    @Override
    public void buildLegs() {
        this.robot.setRobotLegs("Roller Legs");

    }

    public Robot getRobot() {
        return this.robot;
    }

}
