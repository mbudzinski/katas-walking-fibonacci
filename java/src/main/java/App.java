import java.math.BigInteger;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        FibonacciSequence sequence = new FibonacciSequence();

        Iterator<BigInteger> fibonacciIterator = sequence.iterator();
        for (int i = 0; i < 51; i ++) {
            System.out.println(i + ": " + fibonacciIterator.next());
        }

<<<<<<< HEAD
=======
        sequence.setPointer(10000000);

>>>>>>> 51a9c7c6444c4b5003ed0a3a0aa3b526db4a0608
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + fibonacciIterator.next());
        }

    }
}
