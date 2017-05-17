import java.math.BigInteger;
import java.util.Iterator;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) throws InterruptedException {
        FibonacciSequence sequence = new FibonacciSequence();

        Iterator<BigInteger> fibonacciIterator = sequence.iterator();
        for (int i = 0; i < 51; i ++) {
            System.out.println(i + ": " + fibonacciIterator.next());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + fibonacciIterator.next());
        }
    }
}
