import java.util.Scanner;

class Account {
    private double currentBalance;

    public Account(double initialBalance) {
        currentBalance = initialBalance;
    }

    public double checkBalance() {
        return currentBalance;
    }

    public void depositFunds(double amount) {
        currentBalance += amount;
    }

    public boolean withdrawFunds(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
            return true;
        }
        return false;
    }
}

class AutomatedTellerMachine {
    private Account bankAccount;

    public AutomatedTellerMachine(Account account) {
        bankAccount = account;
    }

    public void displayOptions() {
        System.out.println("Welcome to the Automated Teller Machine:");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
    }

    public void operate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayOptions();
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: $" + bankAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.depositFunds(depositAmount);
                    System.out.println("Deposit successful. Your updated balance: $" + bankAccount.checkBalance());
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (bankAccount.withdrawFunds(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Your updated balance: $" + bankAccount.checkBalance());
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection. Please choose a valid option.");
            }
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Account userAccount = new Account(1000); // Initial balance
        AutomatedTellerMachine atmMachine = new AutomatedTellerMachine(userAccount);
        atmMachine.operate();
    }
}
