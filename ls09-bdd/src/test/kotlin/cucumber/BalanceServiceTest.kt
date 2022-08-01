package cucumber

import io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite

@Suite
@SelectClasspathResource("balance/feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "cucumber.steps")
class BalanceServiceTest {
}