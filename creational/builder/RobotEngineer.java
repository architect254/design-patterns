package creational.builder;

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildHead();
        this.robotBuilder.buildTorso();
        this.robotBuilder.buildArms();
        this.robotBuilder.buildLegs();
    }
}
