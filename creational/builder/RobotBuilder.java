package creational.builder;

public interface RobotBuilder {
    public void buildHead();

    public void buildTorso();

    public void buildArms();

    public void buildLegs();

	public Robot getRobot();

    
}
