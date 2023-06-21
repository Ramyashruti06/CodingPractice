package codetalksdna.multithreading;

public class CountOfThreads extends Thread {

    private int threadNumber;

    public CountOfThreads(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + "From Thread" + " " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

