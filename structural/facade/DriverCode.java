package structural.facade;

// use when you want to create a simplified interface that performs many other actions behind the scene
// eg Can I withdraw 50 from the bank
// check if the account is valid
// check if funds are available

public class DriverCode {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(800);
        accessingBank.withdrawCash(500);
    }
}
