import spock.lang.Specification

class FibonacciSequenceTest extends Specification {

    FibonacciSequence sequence = new FibonacciSequence()

    def 'Iterator of Fibonacci sequence returns proper values'() {
        when:
            for (def i = 0; i < 50; i++) {
                ++sequence.iterator()
            }
            def result = ++sequence.iterator()

        then:
            assert (result == expectedValue)

        where:
            expectedValue << [new BigInteger(12586269025)]
    }

}
