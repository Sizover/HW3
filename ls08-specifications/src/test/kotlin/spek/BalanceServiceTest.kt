package spek

import BalanceService
import org.spekframework.spek2.Spek
import org.spekframework.spek2.lifecycle.CachingMode
import org.spekframework.spek2.style.specification.describe
import kotlin.test.DefaultAsserter.assertEquals

class BalanceServiceTest : Spek({

    beforeEachTest {
        println("Root before each test")
    }

    afterEachTest {
        println("Root after each test")
    }

    beforeGroup {
        println("Root before group")
    }

    afterGroup {
        println("Root after group")
    }

    describe("Balance service") {
        beforeEachTest {
            println("before each test")
        }

        afterEachTest {
            println("after each test")
        }

        beforeGroup {
            println("before group")
        }

        afterGroup {
            println("after group")
        }

        val balanceService by memoized(CachingMode.SCOPE) {
            BalanceService()
        }

        it("Adding a balance") {
            balanceService.addBalance(200)
            assertEquals("Balance != 200", 200, balanceService.getBalance())
        }

        it("Remove balance") {
            balanceService.removeBalance(200)
            assertEquals("Balance != -200", -200, balanceService.getBalance())
        }
    }
})