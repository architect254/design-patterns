package behavioral.state;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No Cash available");
    }

    @Override
    public void ejectCard() {
        System.out.println("No cash available");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No Cash available");

    }

    @Override
    public void requestCash(int cashToWithDraw) {
        System.out.println("No Cash available");

    }

}
