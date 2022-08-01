package kotest

import BalanceService
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.comparables.shouldBeEqualComparingTo
import kotlin.test.assertEquals

class BSFunTest : FunSpec({

    isolationMode = IsolationMode.SingleInstance


    context("Balance service") {
        lateinit var balanceService:BalanceService
        beforeTest {
            balanceService = BalanceService()
        }
        afterTest {
            println("after test")
        }
        test("Add a balance to client") {
            balanceService.addBalance(200)
            balanceService.getBalance() shouldBeEqualComparingTo 200
        }
        test("Withdraw balance") {
            balanceService.removeBalance(200)
            assertEquals(0, balanceService.getBalance())
        }
    }
})
