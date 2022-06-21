package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import stepdefinitions.Hook;

/*
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/mobile.feature",
        glue="stepdefinitions",
        snippets=SnippetType.CAMELCASE
        , tags = "not @Not")
public class TestRunnerMobileAndroid {

    @BeforeClass
    public static void setUp() {
        Hook.capabilities("android");
    }


}*/
