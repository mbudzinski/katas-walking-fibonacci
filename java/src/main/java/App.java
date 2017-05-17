import java.math.BigInteger;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

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


        FibonacciSequence sequenceToStream = new FibonacciSequence();

        BigInteger three = new BigInteger("3");

        for (int i = 0; i < 20; i++){
            sequenceToStream.iterator().next();
        }

        Stream<BigInteger> divisibleByThree = sequenceToStream.getStream().filter(bigInteger ->
                BigInteger.ZERO.equals(bigInteger.remainder(three)) && !BigInteger.ZERO.equals(bigInteger)
        );

        Optional<BigInteger> firstDivisibleByThree = divisibleByThree.findFirst();

        if (firstDivisibleByThree.isPresent()) {
            System.out.println("Found! : " + firstDivisibleByThree.get());
        } else {
            System.out.println("Not found!");
        }


    }
}
