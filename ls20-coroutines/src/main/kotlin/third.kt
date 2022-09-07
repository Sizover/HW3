import kotlinx.coroutines.*

fun main() {
    runBlocking {
//        launch(Dispatchers.IO) {
//            println(Thread.currentThread().name)
//            for (i in 1..100) {
//                println(i)
//                if (i % 10 == 0) {
//                    yield()
//                }
//            }
//        }
//
//        launch(Dispatchers.Default) {
//            println(Thread.currentThread().name)
//            for (i in 800 downTo 200) {
//                println(i)
//                if (i % 10 == 0) {
//                    yield()
//                }
//            }
//        }
        launch(Dispatchers.IO) {         getDataFromApi1() }
        launch(Dispatchers.Default) {    calculateBlackHole() }
        launch(Dispatchers.IO) {    getDataFromApi2() }
    }
}

suspend fun getDataFromApi1() {
    println(1)
    delay(100)
}

suspend fun getDataFromApi2() {
    println(2)
    delay(200)
}

suspend fun calculateBlackHole() {
    println("This is big")
    delay(1000)
}

