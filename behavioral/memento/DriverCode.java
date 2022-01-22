package behavioral.memento;

// a way to store previous states of an object easily
// Memento: The basic object that is stored in different states
// Originator: Sets and Gets values form the currently targeted Memento
//             Creates new Mementos and assigns values to them
// Caretaker:  Holds an Arraylist that contains all previous versions of the memento.
//             It can store and retrieve stored Mementos
public class DriverCode {
    public static void main(String[] args) {
        new MementoTest();
    }
}
