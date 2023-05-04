package codetalksdna.AbstractionUsingInterfacePrograms;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("In Car I will start in Ignition");
    }
}
