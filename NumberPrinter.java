
public class NumberPrinter {
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                System.out.println("Odd Thread " + number);
                number++;
                notify();
            } else {
                try {
                    wait(); // wat for even thread
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even Thread " + number);
                number++;
                notify();
            } else {
                try {
                    wait(); // wat for odd thread
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberPrinter print = new NumberPrinter();
        Thread oddThread = new Thread(print::printOdd);
        Thread evenThread = new Thread(print::printEven);
        oddThread.start();
        evenThread.start();

    }
}