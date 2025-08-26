public class CoordinatedThreads {
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printNumbers(String threadName) {
        while (number <= MAX) {
            System.out.println(threadName + " prints " + number);
            number++;
            notify();
            try {
                if (number <= MAX) {
                    wait();
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {

        CoordinatedThreads print = new CoordinatedThreads();
        Thread t1 = new Thread(() -> print.printNumbers("Thread-1"));
        Thread t2 = new Thread(() -> print.printNumbers("Thread-2"));
        t1.start();
        t2.start();

    }
}
