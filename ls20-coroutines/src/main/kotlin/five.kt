import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main() {
    runBlocking {
//        val job = launch {
//            println("A")
//            delay(1000)
//            println("B")
//        }
//        job.join()
//        if (job.isCompleted) {
//            println("Finish")
//        }
        val res = async<Int> {
            getRandomInt()
        }

        val res1 = async {
            getRandomInt()
        }
        println(res.await() + res1.await())
    }
}

suspend fun getRandomInt(): Int {
    delay(2000)
    val result = Random.nextInt(1, 99999)
    println(result)
    return result
}