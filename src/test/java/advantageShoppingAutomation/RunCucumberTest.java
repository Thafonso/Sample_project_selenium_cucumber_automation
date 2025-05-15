package advantageShoppingAutomation;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "advantageShoppingAutomation.steps")
@ConfigurationParameter(key = "cucumber.verbose", value = "true")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm, pretty, json:target/jsonReports/cucumber-report.json, timeline:build/test-results/timeline")

public class RunCucumberTest {

}
