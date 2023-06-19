package codetalksdna.CodingPrograms;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 1, 3, 5);
        numbers.forEach(System.out::println);

        String str = "Hello, World!";
        str.chars().forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jane", "Alice");
        names.forEach(System.out::println);

        MyFunctionalInterface functionalInterface = MyClass::new;
        MyClass myObject = functionalInterface.create("Example");
        myObject.printMessage();
    }
}

interface MyFunctionalInterface {
    MyClass create(String message);
}

class MyClass {
    private String message;

    MyClass(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println(message);
    }
}
