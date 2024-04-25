package atm;

public class Account {
    private double balance = 0;
    private short pin = 1234;

    Display display = new Display();

    void checkBalance() {
        display.prompt("Your balance is: " + balance);
    }

    void withdraw() {
        double amount = Double.parseDouble(display.input("Enter amount to withdraw: "));
        if (amount > balance) {
            display.prompt("Insufficient funds");
            return;
        }
        balance -= amount;
        display.prompt("You have withdrawn " + amount + ". Your balance is: " + balance);
    }

    void deposit() {
        double amount = Double.parseDouble(display.input("Enter amount to deposit: "));
        balance += amount;
        display.prompt("You have deposited " + amount + ". Your balance is: " + balance);
    }

    short getPin() {
        return pin;
    }

    void changePin() {
        while (true) {
            String pin = display.input("Enter new pin: ");
            if (pin.length() != 4) {
                display.prompt("Pin must be 4 digits");
                continue;
            }
            this.pin = Short.parseShort(pin);
            display.prompt("Your pin has been changed to " + pin);
            break;
        }
    }

    void exit() {
        Display.scanner.close();
        display.prompt("Thank you for using our ATM");
    }
}
