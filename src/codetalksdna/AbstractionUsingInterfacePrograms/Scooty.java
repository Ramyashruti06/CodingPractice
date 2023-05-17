package codetalksdna.AbstractionUsingInterfacePrograms;

public class Scooty implements Vehicle {

    @Override
    public void start() {
        System.out.println("It can be started with key as well as kick");
    }

    @Override
    public void tyres() {
        System.out.println("I have Scooty and it has 2 Tyres");
    }
}
