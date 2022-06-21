package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import stepdefinitions.Hook;

import java.net.MalformedURLException;
import java.net.URL;


/*
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/automationPractice.feature",
        glue="stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class TestRunnerSafari {

    @BeforeClass
    public static void setUp() {
        Hook.capabilities("safari");
    }
}
*/