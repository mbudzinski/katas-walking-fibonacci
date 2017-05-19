import java.math.BigInteger;
import java.util.Iterator;


public class App {

    public static void main(String[] args) throws InterruptedException {
        FibonacciSequence sequence = new FibonacciSequence();

        Iterator<BigInteger> fibonacciIterator = sequence.iterator();

        for (int i = 0; i < 10000; i++) {
            fibonacciIterator.next();
        }

        System.out.println(fibonacciIterator.next());

/*        FibonacciSequence sequenceToStream = new FibonacciSequence();

        BigInteger three = new BigInteger("3");*/

        /*for (int i = 0; i < 20; i++){
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
        }*/


    }
}
