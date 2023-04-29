package codetalksdna.Inheritance;

//Parent Class.
class Birds {
    public void birdSound() {
        System.out.println("Birds has a special Sound.");
    }
}

//Child Class.
class Parrot extends Birds {
    public void parrotSound() {
        System.out.println("Parrot has its own Sound.");
    }
}

//Child Class.
class Peacock extends Birds {
    public void peacockSound() {
        System.out.println("Peacock has its own Sound.");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Peacock peacock = new Peacock();
        peacock.peacockSound();
        peacock.birdSound();
        System.out.println("-----------------------------------");
        Parrot parrot = new Parrot();
        parrot.parrotSound();
        parrot.birdSound();
    }
}
