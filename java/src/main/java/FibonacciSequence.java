import java.math.BigInteger;
import java.util.*;

public class FibonacciSequence implements Iterable<BigInteger>{

    private BigInteger n;
    private BigInteger nMinus1;
    private BigInteger nMinus2;
    private int pointer;

    public FibonacciSequence() {
        n = new BigInteger("1");
        nMinus1 = BigInteger.ONE;
        pointer = 0;
    }


    @Override
    public Iterator<BigInteger> iterator() {

        return new Iterator<BigInteger>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public BigInteger next() {

                    if (pointer == 0) {
                        pointer++;
                        return BigInteger.ZERO;
                    }
                    if (pointer == 1) {
                        pointer++;
                        return BigInteger.ONE;
                    }

                    BigInteger nBeforeAddition = n;
                    nMinus2 = nMinus1;
                    nMinus1 = nBeforeAddition;
                    n = BigInteger.ZERO.add(nMinus1.add(nMinus2));
                    return n;
            }
        };
    }
}
