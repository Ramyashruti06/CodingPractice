package codetalksdna.CodingPrograms;

public class MethodExecutionTime {
    public static void main(String[] args) {
        MethodExecutionTime met = new MethodExecutionTime();
        long start = System.nanoTime();
        long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution time: " + execution + "nanoseconds");
    }
}
