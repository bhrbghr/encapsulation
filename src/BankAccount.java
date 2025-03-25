public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid Amount, must be a positive number.");
        }else{
            this.balance += amount;
            System.out.println(amount + "deposited to account" + accountNumber);
        }
    }


    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid");
        } else if (amount > balance) {
            System.out.println("insufficient funds.");
        } else {
            balance -= amount;
            System.out.println(amount + "withdrawn from account" + accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}


