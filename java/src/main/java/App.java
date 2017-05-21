import java.math.BigInteger;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class App {

    public static void main(String[] args) throws InterruptedException {
        FibonacciSequence sequence = new FibonacciSequence();

        Iterator<BigInteger> fibonacciIterator = sequence.iterator();

        for (int i = 0; i < 10000; i++) {
            fibonacciIterator.next();
        }

        Stream<BigInteger> fibonacciStream = (Stream<BigInteger>) getStreamFromIterator(fibonacciIterator);

        System.out.println(fibonacciIterator.next());

        Optional<BigInteger> anyFibonacci = fibonacciStream.findAny();

        anyFibonacci.ifPresent(System.out::println);
    }

    private static <E> Stream<? extends E> getStreamFromIterator(Iterator<? extends E> iterator) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator,
                                                                        Spliterator.ORDERED), false);
    }

}
