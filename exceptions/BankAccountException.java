// Clean User-Defined Exception Example - Banking System

import java.util.Scanner;

// Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawAmount;

    public InsufficientBalanceException(double balance, double withdrawAmount) {
        super("Insufficient balance! Available: " + balance + ", Requested: " + withdrawAmount);
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }
}

// Custom Exception for invalid account number
class InvalidAccountException extends Exception {
    public InvalidAccountException(String accountNumber) {
        super("Invalid account number: " + accountNumber);
    }
}

// Custom Exception for negative amount
class NegativeAmountException extends Exception {
    public NegativeAmountException(double amount) {
        super("Amount cannot be negative: " + amount);
    }
}

// Bank Account class
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit method with validation
    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException(amount);
        }
        balance += amount;
        System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
    }

    // Withdraw method with validation
    public void withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount + ". Remaining balance: $" + balance);
    }

    // Account validation
    public static void validateAccount(String accountNumber) throws InvalidAccountException {
        if (accountNumber == null || accountNumber.length() != 10 || !accountNumber.matches("\\d+")) {
            throw new InvalidAccountException(accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

public class BankAccountException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Create account with validation
            System.out.print("Enter account number (10 digits): ");
            String accountNumber = sc.nextLine();
            BankAccount.validateAccount(accountNumber);

            System.out.print("Enter account holder name: ");
            String accountHolder = sc.nextLine();

            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();

            BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
            System.out.println("\n=== Account Created Successfully ===");
            System.out.println("Account: " + account.getAccountNumber());
            System.out.println("Holder: " + account.getAccountHolder());
            System.out.println("Balance: $" + account.getBalance());

            // Banking operations
            while (true) {
                System.out.println("\n=== Banking Operations ===");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.println("Current balance: $" + account.getBalance());
                        break;

                    case 4:
                        System.out.println("Thank you for banking with us!");
                        return;

                    default:
                        System.out.println("Invalid option!");
                }
            }

        } catch (InvalidAccountException e) {
            System.err.println("Account Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
            System.err.println("Shortfall: $" + (e.getWithdrawAmount() - e.getBalance()));

        } catch (NegativeAmountException e) {
            System.err.println("Invalid Amount: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());

        } finally {
            System.out.println("\n=== Banking Session Ended ===");
            sc.close();
        }
    }
}
