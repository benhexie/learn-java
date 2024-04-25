package atm;

public class Pin {
    Display display = new Display();

    private short pin;

    Pin(short pin) {
        this.pin = pin;
    }

    boolean intro() {
        for (int i = 0; i < 3; i++) {
            String pin = display.input("Enter your pin: ");
            if (verify(pin)) return true;
            if (i < 2) display.prompt("Invalid pin. Try again.");
        }

        display.prompt("You have entered the wrong pin 3 times. Your card is blocked.");
        return false;
    }

    boolean verify(String pin) {
        return Short.parseShort(pin) == this.pin;
    }
}
