import spock.lang.Specification

class FibonacciSequenceTest extends Specification {


    def 'Iterator of Fibonacci sequence returns 0 on first call'() {
        given:
            FibonacciSequence sequence = new FibonacciSequence()
            Iterator<BigInteger> iterator = sequence.iterator()

        when:

            def result = iterator.next()

        then:
            result == BigInteger.ZERO
    }

    def 'Iterator of Fibonacci sequence returns 1 on second call'() {
        given:
            FibonacciSequence sequence = new FibonacciSequence()
            Iterator<BigInteger> iterator = sequence.iterator()

        when:
            iterator.next()
            def result = iterator.next()

        then:
            result == BigInteger.ONE
    }


    def 'Iterator of Fibonacci sequence returns proper values'() {
        given:
            FibonacciSequence sequence = new FibonacciSequence()
            Iterator<BigInteger> iterator = sequence.iterator()

            def nMinus2 = BigInteger.ZERO
            def nMinus1 = BigInteger.ONE
            def n = BigInteger.ONE


            for(int i = 0; i < 2000; i++) {
                expect:
                    if (i < 2) {
                        n = iterator.next()
                    }

                    if (i > 1) {
                        def nBeforeAddition = new BigInteger(n.toString())

                        n = iterator.next()
                        nMinus2 = new BigInteger(nMinus1.toString())
                        nMinus1 = new BigInteger(nBeforeAddition.toString())

                        assert(n.toString() == (nMinus1.add(nMinus2)).toString())
                    }
            }
    }
}
