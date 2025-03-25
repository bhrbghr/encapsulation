public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for transaction accounts.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid");
        } else if (amount > balance + overDraftLimit) {
            System.out.println("insufficient funds.");
        } else {
            balance -= amount;
            System.out.println(amount + "withdrawn from account" + getAccountNumber());
        }
    }

}
