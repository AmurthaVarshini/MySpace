import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for " + accountHolder);
        } else {
            balance -= amount;
            System.out.println(accountHolder + " withdrew ₹" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return accountHolder + " | Balance: ₹" + balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println(accountHolder + " earned ₹" + interest + " as interest.");
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println(accountHolder + "'s Current Account does not earn interest.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + OVERDRAFT_LIMIT) {
            System.out.println("Withdrawal exceeds overdraft limit for " + accountHolder);
        } else {
            balance -= amount;
            System.out.println(accountHolder + " withdrew ₹" + amount + " (Overdraft used if necessary)");
        }
    }
}

class TransactionThread extends Thread {
    private BankAccount account;
    private double amount;
    private boolean isDeposit;

    public TransactionThread(BankAccount account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("Alice", 5000));
        accounts.add(new CurrentAccount("Bob", 2000));

        System.out.println("Initial Balances:");
        accounts.forEach(System.out::println);

        accounts.forEach(BankAccount::calculateInterest);

        TransactionThread t1 = new TransactionThread(accounts.get(0), 1000, true); // Deposit
        TransactionThread t2 = new TransactionThread(accounts.get(1), 3000, false); // Withdraw

        t1.start();
        t2.start();

l        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("\nFinal Balances:");
        accounts.forEach(System.out::println);
    }
