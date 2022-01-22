package structural.proxy;

public class ATMMachineProxy implements GetATMData {
    ATMMachine realATMMachine = new ATMMachine();

    @Override
    public ATMState getATMState() {
        return realATMMachine.getATMState();
    }

    @Override
    public int getCashInMachine() {
        return realATMMachine.getCashInMachine();
    }

}
