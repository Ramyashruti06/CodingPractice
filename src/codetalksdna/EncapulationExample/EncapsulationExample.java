package codetalksdna.EncapulationExample;

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankAccountNumber(10000);
        System.out.println(bankAccount.getBankBalance());
    }
}
