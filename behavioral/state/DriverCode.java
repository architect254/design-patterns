package behavioral.state;

// allows an object to alter its behavior when its internal state changes
// the object will appear to change its class

// Context: Maintains an instance of a ConcreteState subclass that defines the current state.

// State: Defines an interface for encapsulating the behaviour associated with a particular state of the Context

// Concrete State: Each subclass implements a behavior associated with a particular state of the context
public class DriverCode {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }
}
