package classes;

public abstract class Animals {
    private String name;

    Animals(String name) {
        this.name = name;
    }

    abstract void sound();

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Kitty");
        Cow cow = new Cow("Betsy");

        System.out.print(dog.getName() + " says: ");
        dog.sound();
        System.out.print(cat.getName() + " says: ");
        cat.sound();
        System.out.print(cow.getName() + " says: ");
        cow.sound();
    }
}

final class Dog extends Animals {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("woof woof");
    }
}

final class Cat extends Animals {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("meow");
    }
}

final class Cow extends Animals {
    Cow(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("moo");
    }
}