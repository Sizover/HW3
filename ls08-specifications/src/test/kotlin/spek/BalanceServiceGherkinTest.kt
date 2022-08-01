package spek

import BalanceService
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import kotlin.test.assertEquals

class BalanceServiceGherkinTest : Spek({

    Feature("Balance service") {

        val balanceService by memoized { BalanceService() }

        Scenario("Client add balance") {

            When("Add a balance") {
                balanceService.addBalance(200)
            }
            Then("Balance should be equal 200") {
                assertEquals( 200, balanceService.getBalance())
            }
        }

        Scenario("Client withdraw money") {
            When("Withdraw a balance") {
                balanceService.removeBalance(200)
            }
            Then("Balance should be -200") {
                assertEquals(-200, balanceService.getBalance())
            }
        }
    }

})