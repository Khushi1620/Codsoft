import java.util.Scanner;

class ATM_Interface {
    double amount;
    int pin;

    public void createPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create your pin here: ");
        pin = sc.nextInt();
    }
    int count = 0;
    public void checkPin() {

        System.out.println("Enter your pin here: ");
        Scanner sc = new Scanner (System.in);
        int givenPin = sc.nextInt();
        if (givenPin == pin) {
            menu();
        } else {

            System.out.println("Invalid pin...!!!!");
            count++;
            if (count < 4) {
                checkPin();
            } else {
                count = 0;
                return;
            }
        }
    }

    private void menu() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a valid choice: ");
        System.out.println("1. Check your account balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit");
        int num = sc.nextInt();
        if (num == 1) {
            checkBalance();
        } else if (num == 2) {
            withdrawMoney();
        } else if (num == 3) {
            depositMoney();
        } else if (num == 4) {
            System.out.println("Thanks for visiting..");
            return;
        } else {
            System.out.println("Your choice is invalid...!!!!");
            System.out.println("Please recheck your choice...");
        }
    }

    private void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double money = sc.nextDouble();
         amount += money;
         menu();
    }

    private void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double money = sc.nextDouble();
        if (money > amount) {
            System.out.println("Insufficient balance...!!!!");
        } else {
            amount -= money;
        }
        menu();
    }

    private void checkBalance() {
        System.out.println(amount);
        menu();
    }
}

public class ATM {
    public static void main(String[] args) {
        ATM_Interface costumer = new ATM_Interface();
        costumer.createPin();
        costumer.checkPin();
    }
}
