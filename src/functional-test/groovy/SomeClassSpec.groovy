

import spock.lang.Specification

class SomeClassSpec extends Specification {

    def "Addition"() {
        given:
        def a = 15
        def b = 5
        expect:
        SomeClass.randomBehaviour(a, b) == 20
    }
}
