package serenity//import net.serenitybdd.junit.runners.SerenityRunner
//import net.thucydides.core.annotations.Steps
//import net.thucydides.core.annotations.Title
//import org.junit.Test
//import org.junit.runner.RunWith
//
//@RunWith(SerenityRunner::class)
//class BalanceServiceTest {
//
//    @Steps
//    lateinit var client: BalanceServiceSteps
//
//    @Test
//    @Title("Test to check adding money")
//    fun addingMoneyTest() {
//        client.addMoneyToBalance(200)
//        val count = client.getBalanceCount()
//        client.checkBalance(200, count)
//    }
//}