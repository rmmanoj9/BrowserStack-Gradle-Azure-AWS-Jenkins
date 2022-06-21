package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/automationPractice.feature",
        glue="stepdefinitions",
        snippets=SnippetType.CAMELCASE
        , tags = "not @Not")

public class TestRunnerParallel1 extends BrowserStackSerenityTest{

}
