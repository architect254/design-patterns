package creational.builder;

public class Robot implements RobotPlan {
    private String head;
    private String torso;
    private String arms;
    private String legs;

    public String getHead() {
        return this.head;
    }

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    public String getTorso() {
        return this.torso;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.torso = torso;

    }

    public String getArms() {
        return this.arms;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms = arms;

    }

    public String getLegs() {
        return this.legs;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;

    }

}
