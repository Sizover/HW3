package kotest

import BalanceService
import io.kotest.core.spec.IsolationMode
//import io.kotest.core.spec.style.FeatureSpec
import io.kotest.core.spec.style.FunSpec
//import io.kotest.datatest.withData
import io.kotest.matchers.comparables.shouldBeEqualComparingTo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.test.assertEquals

class BSFunTest : FunSpec({

    isolationMode = IsolationMode.SingleInstance


    context("Balance service") {
        lateinit var balanceService:BalanceService
        beforeTest {
            balanceService = BalanceService()
        }
        afterTest {
            print("after BSFunTest ")
        }
        test("Add a balance to client") {
            balanceService.addBalance(200)
            balanceService.getBalance() shouldBeEqualComparingTo 200
        }
        test("Withdraw balance") {
            balanceService.removeBalance(200)
            assertEquals(0, balanceService.getBalance())
        }
        test("errorTest") {
            withContext(Dispatchers.IO) {
                delay(300L)
            }
            throw IllegalStateException("some exception thrown")
        }
    }
})
