package behavioral.state;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMachine) {
        atmMachine = newATMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Already entered PIN");

    }

    @Override
    public void requestCash(int cashToWithDraw) {
        if (cashToWithDraw > atmMachine.cashInMachine) {
            System.out.println("Don't have that Cash");
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithDraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithDraw);
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }

}
