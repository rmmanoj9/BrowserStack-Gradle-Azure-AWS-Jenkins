package stepdefinitions;

import cucumber.api.java.en.Then;

public class LocalCheckSteps {
    LocalPage localPage;

    @Then("^I should see \"([^\"]*)\"$")
    public void matchTitle(String matchTitle) throws Throwable {
        localPage.open();
    }
}
