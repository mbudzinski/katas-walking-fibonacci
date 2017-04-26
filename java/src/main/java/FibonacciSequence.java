import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class FibonacciSequence {

    private List<BigDecimal> sequence = new ArrayList<>();

    public FibonacciSequence() {
        sequence.add(BigDecimal.ZERO);
        sequence.add(BigDecimal.ONE);
        sequence.add(BigDecimal.ONE);
    }

    private List<BigDecimal> getSequence() {
        return sequence;
    }
}
