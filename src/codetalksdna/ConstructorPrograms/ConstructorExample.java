package codetalksdna.ConstructorPrograms;

public class ConstructorExample {
    public static void main(String[] args) {
        //Every Object Creation takes 16Bytes of Memory.

        //Example Of Parameterized Constructor.
        Student student = new Student(1 , "B");

        //Example Of No-Arg Constructor.
        Student student1 = new Student();
        System.out.println(student1);
        System.out.println(student1.hashCode());
    }
}
