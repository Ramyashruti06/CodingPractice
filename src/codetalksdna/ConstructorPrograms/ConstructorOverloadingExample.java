package codetalksdna.ConstructorPrograms;

public class ConstructorOverloadingExample {

    int length, breadth;

    public ConstructorOverloadingExample() {
    }

    public ConstructorOverloadingExample(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int areaOfRectangle() {
        int area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample constructorOverloadingExample = new ConstructorOverloadingExample(20, 30);
        System.out.println(constructorOverloadingExample.areaOfRectangle());
    }
}
