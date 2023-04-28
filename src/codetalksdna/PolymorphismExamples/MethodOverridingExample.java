package codetalksdna.PolymorphismExamples;


class Animal {
    public void displayMessage() {
        System.out.println("Animal remains animal");
    }

    public void displayMessageAnimal() {
        System.out.println("Animal is animal");
    }
}

class Dog extends Animal {
    public void displayMessage() {
        System.out.println("I am a Dog!!");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayMessage();
        dog.displayMessageAnimal();

    }
}
