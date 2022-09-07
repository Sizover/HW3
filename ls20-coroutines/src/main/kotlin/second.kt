import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

suspend fun doSuspendWork() {
    println(Thread.currentThread().name)
    for (i in 1 .. 100) {
        println(i)
        if (i % 10 == 0) {
            yield()
        }
    }
}

fun main() {
    Thread.sleep(200)
    runBlocking {
        launch {
            doSuspendWork()
        }
        launch {
            doSuspendWork()
        }
        launch {
            doSuspendWork()
        }
    }
}