package stepdefinitions;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://bs-local.com:45691/check")
public class LocalPage extends PageObject {
    private WebDriver driverInstance;

    public LocalPage(WebDriver driver) {
        super(driver);
        driverInstance = driver;
    }

}
