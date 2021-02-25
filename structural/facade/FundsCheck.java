package structural.facade;

public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > getCashInAccount()) {
            System.out.println("Error: You dont have enough money");
            System.out.println("Current Balance is " + getCashInAccount());

            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
            return true;
        }

    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }
}
