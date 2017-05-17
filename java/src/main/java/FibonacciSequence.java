import java.math.BigInteger;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class FibonacciSequence implements Iterable<BigInteger>{

    private List<BigInteger> sequence;

    private int pointer = 0;

    public FibonacciSequence() {
        sequence = new ArrayList<>();
        sequence.add(BigInteger.ZERO);
        sequence.add(BigInteger.ONE);
    }


    public Stream<BigInteger> getStream() {
        return sequence.stream();
    }

    private BigInteger getLast() {
        return sequence.get(sequence.size() - 1);
    }

    private BigInteger getValueBeforeLast() {
        return sequence.get(sequence.size() - 2);
    }

    @Override
    public Iterator<BigInteger> iterator() {

        return new Iterator<BigInteger>() {

            @Override
            public boolean hasNext() {
                return pointer <= sequence.size() - 1;
            }

            @Override
            public BigInteger next() {
                BigInteger valueToReturn;

                if (hasNext()) {
                    valueToReturn = sequence.get(pointer);
                    ++pointer;
                    return valueToReturn;
                } else {
                    while (!hasNext()) {
                        BigInteger lastValue = getLast();
                        sequence.add(lastValue.add(getValueBeforeLast()));
                    }
                }

                valueToReturn = getLast();
                ++pointer;
                return valueToReturn;
            }
        };
    }
}
