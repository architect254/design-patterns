package structural.proxy;

// provides a class which will limit access to another class
// this may be done for security reasons, because an object is intensive to create
// or is accessed from remote location

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

        GetATMData atmProxy = new ATMMachineProxy();
        System.out.println("\nCurrent ATM state " + atmProxy.getATMState());
        System.out.println("\nCash in ATM Machine " + atmProxy.getCashInMachine());

    }
}
