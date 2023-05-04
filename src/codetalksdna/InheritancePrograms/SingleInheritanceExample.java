package codetalksdna.InheritancePrograms;

//Parent Class.
class Animal {
    public void animalEatingProperty() {
        System.out.println("Animal is eating");
    }
}

//Child Class.
class Dog extends Animal{
    public void dogEatingProperty() {
        System.out.println("Dog is eating");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogEatingProperty();
        dog.animalEatingProperty();
    }
}
