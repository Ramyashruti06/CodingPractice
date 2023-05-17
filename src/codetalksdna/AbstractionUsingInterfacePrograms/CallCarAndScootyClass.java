package codetalksdna.AbstractionUsingInterfacePrograms;

public class CallCarAndScootyClass {
    public static void main(String[] args) {
        Scooty scooty = new Scooty();
        Car car = new Car();
        scooty.start();
        scooty.tyres();
        car.start();
        car.tyres();
    }
}
