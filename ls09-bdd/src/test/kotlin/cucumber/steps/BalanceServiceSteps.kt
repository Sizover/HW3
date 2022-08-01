package cucumber.steps

import BalanceService
import io.cucumber.java8.En
import io.cucumber.java8.Ru
import kotlin.test.assertEquals

class BalanceServiceSteps : En {

    init {

        lateinit var balanceService: BalanceService

        Given("A client with zero balance") {
            balanceService = BalanceService()
        }

        When("Add a {int} money to balance") { int: Int ->
            balanceService.addMoney(int)
        }

        When("Withdraw {int} money from balance") { int: Int ->
            balanceService.withdrawMoney(int)
        }

        Then("Balance should be equal {int}") { int: Int ->
            assertEquals(int, balanceService.getBalance())
        }


    }
}