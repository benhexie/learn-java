package atm;

public class Menu {
    Account account;
    Display display = new Display();

    Menu(Account account) {
        this.account = account;
    }


    void show() {
        display.clear();
        display.prompt("1. Check balance");
        display.prompt("2. Withdraw");
        display.prompt("3. Deposit");
        display.prompt("4. Change pin");
        display.prompt("5. Exit");
        select();
    }

    boolean askToContinue() {
        String choice = display.input("Do you want to continue? (y/n): ");
        return choice.equals("y");
    }

    void select() {
        String choice = display.input("Select an option: ");
        switch (choice) {
            case "1":
                this.account.checkBalance();
                break;
            case "2":
                this.account.withdraw();
                break;
            case "3":
                this.account.deposit();
                break;
            case "4":
                this.account.changePin();
                break;
            case "5":
                break;
            default:
                display.input("Invalid option. Try again: ");
        }

        if (!choice.equals("5") && askToContinue()) show();
    }
}
