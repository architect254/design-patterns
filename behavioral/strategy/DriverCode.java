package behavioral.strategy;

//Driver Code for Strategy Pattern
//Strategy Design Pattern is used to add dynamic functionality to subclasses and abstract out their differences 
//A superclass change shouldnt break the subclasses
public class DriverCode {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal twitty = new Bird();

        System.out.println("Sparky " + sparky.tryToFly());
        System.out.println("Twitty " + twitty.tryToFly());

        sparky.setFlyingType(new ItFlys());

        System.out.println("Sparky " + sparky.tryToFly());
        System.out.println("Twitty " + twitty.tryToFly());

    }
}
