package kotest

class CountOfTestRun {
    private var count = 3

    fun minusCount() {
        count -= 1
    }

    fun getCount() = count
}