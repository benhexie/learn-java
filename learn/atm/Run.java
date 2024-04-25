package atm;

public class Run {
    static void intro(String bank) {
        Display display = new Display();
        display.clear();
        System.out.println("Welcome to " + bank + " ATM\n");
    }


    public static void main(String[] args) {
        Account account = new Account();
        String bank = args.length > 0 ? String.join(" ", args) : "World Bank";
        intro(bank);

        // Validate pin
        Pin pin = new Pin(account.getPin());
        if (!pin.intro()) return;

        // Display menu
        Menu menu = new Menu(account);
        menu.show();

        account.exit();
    }
}
