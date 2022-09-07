import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertTrue

class SomeTest {

    @Test
    fun doTest() {
        runTest {
            testScheduler
            val res = getRandomInt()
            assertTrue { res in 1..99999 }
        }
    }
}