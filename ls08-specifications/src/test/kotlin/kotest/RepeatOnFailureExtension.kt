package kotest

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.core.extensions.TestCaseExtension
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult

object  RepeatOnFailureExtension: TestCaseExtension {

    override suspend fun intercept(testCase: TestCase, execute: suspend (TestCase) -> TestResult): TestResult {
        val localCount = CountOfTestRun()
        var testResult: TestResult
        do {
            testResult = execute(testCase)
            println("прогон ${localCount.getCount()} теста \"${testCase.name.testName}\" -> $testResult")
            localCount.minusCount()
        } while (testResult.isErrorOrFailure && localCount.getCount() >= 0)
        return testResult
    }


}


object MyConfig : AbstractProjectConfig() {
    override fun extensions(): List<Extension> = listOf(RepeatOnFailureExtension)

}
