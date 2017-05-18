import spock.lang.Shared
import spock.lang.Specification

class FibonacciSequenceTest extends Specification {

    @Shared
    LinkedList<BigInteger> resultList = [BigInteger.ZERO, BigInteger.ONE]

    def 'Iterator of Fibonacci sequence returns 0 on 0'() {
        given:
            FibonacciSequence sequence = new FibonacciSequence()

        when:
            def result = ++sequence.iterator()

        then:
            result == BigInteger.ZERO
    }

    def 'Iterator of Fibonacci sequence returns 1 on 1'() {
        given:
            FibonacciSequence sequence = new FibonacciSequence()

        when:
            ++sequence.iterator()
            def result = ++sequence.iterator()

        then:
            result == BigInteger.ONE
    }


    def 'Iterator of Fibonacci sequence returns proper values'() {
        given:
            FibonacciSequence sequence = new FibonacciSequence()
            Iterator<BigInteger> iterator = sequence.iterator()

        when:
            true
        then:
            for(int i = 0; i < 10000; i++) {
                def result = iterator.next()
                resultList.removeAt(0)
                resultList.add(result)
                assert(result.toString() == expectedValue.toString())
            }

        where:
            expectedValue << getExpectedResultFromArray(resultList)
    }

    def getExpectedResultFromArray(List<BigInteger> resultList) {
        if (resultList == null) {
            resultList = [BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE]
        }
        return resultList.get(0).add(resultList.get(1))
    }

}
