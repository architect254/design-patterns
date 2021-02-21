package creational.prototype;

// used for creating new objects by cloning other objects
// allows for adding of any subclass instance of a known superclass at runtime
// when there are numerous potential classes that you want to only use if needed at runtime
// reduces need for creating subclasses
public class DriverCode {
    public static void main(String[] args) {
        CloneFactory cloneFactory = new CloneFactory();
        Sheep Sally = new Sheep();
        Sheep clonedSheep = (Sheep) cloneFactory.getClone(Sally);
        System.out.println(Sally);
        System.out.println(clonedSheep);
    }
}
