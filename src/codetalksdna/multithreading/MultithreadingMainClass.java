package codetalksdna.multithreading;

public class MultithreadingMainClass {
    public static void main(String[] args) {
        MultithreadingExample multithreadingExample = new MultithreadingExample();
        multithreadingExample.start();

        MultithreadingByRunnableInterface multithreadingByRunnableInterface = new MultithreadingByRunnableInterface();
        Thread thread = new Thread(multithreadingByRunnableInterface);
        thread.start();
        for (int i = 0; i <= 3; i++) {
            CountOfThreads countOfThreads = new CountOfThreads(i);
            Thread myThread = new Thread(countOfThreads);
            myThread.start();
        }
    }
}
