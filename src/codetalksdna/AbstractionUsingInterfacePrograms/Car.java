package codetalksdna.AbstractionUsingInterfacePrograms;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("In Car I will start in Ignition");
    }

    @Override
    public void tyres() {
        System.out.println("I have Car and it has 4 Tyres");
    }
}
