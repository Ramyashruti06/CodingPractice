package codetalksdna.AbstractionUsingAbstractClassPrograms;

public class CallCarAndScootyClass {
    public static void main(String[] args) {
        Scooty scooty = new Scooty();
        Car car = new Car();
        scooty.start();
        car.start();
    }
}
