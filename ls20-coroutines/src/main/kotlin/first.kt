import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        println("A")
        delay(1000)
        println("B")
    }
    launch {
        println("C")
        delay(2000)
        println("D")
    }
    println("x")
}
