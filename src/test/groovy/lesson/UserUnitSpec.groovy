package lesson

import grails.test.mixin.TestFor
import spock.lang.Specification
import unit.UserUnit

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(UserUnit)
class UserUnitSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
