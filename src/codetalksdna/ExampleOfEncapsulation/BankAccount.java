package codetalksdna.ExampleOfEncapsulation;

public class BankAccount {
    //Data is hided.
    private int bankAccountNumber;
    private int bankBalance;

    //Code acting on the variables or Data.
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
}
