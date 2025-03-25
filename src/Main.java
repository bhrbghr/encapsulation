public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        SavingsAccount sa1 = new SavingsAccount("1001", "Alice", 1000);
        SavingsAccount sa2 = new SavingsAccount("1002", "Bob", 2000);
        SavingsAccount sa3 = new SavingsAccount("1003", "Charlie", 3000);

        TransactionAccount ta1 = new TransactionAccount("2001", "Dave", 1500);
        TransactionAccount ta2 = new TransactionAccount("2002", "Eve", 2500);
        TransactionAccount ta3 = new TransactionAccount("2003", "Frank", 3500);

        bank.addAccount(sa1);
        bank.addAccount(sa2);
        bank.addAccount(sa3);
        bank.addAccount(ta1);
        bank.addAccount(ta2);
        bank.addAccount(ta3);

        bank.findAccount("1001");
        bank.findAccount("9999");

        System.out.println("Initial balance: " + sa1.getBalance());
        sa1.deposit(500);
        System.out.println("Updated balance: " + sa1.getBalance());
        sa1.deposit(-100);

        sa1.calculateInterest();
        ta1.calculateInterest();

        sa1.withdraw(200);
        sa1.withdraw(-50);
        sa1.withdraw(20000);

        ta1.withdraw(300);
        ta1.withdraw(-20);
        ta1.withdraw(2500);

        bank.showAllBalances();
    }
}
