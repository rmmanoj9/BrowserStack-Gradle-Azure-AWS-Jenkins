package com.demoqa.automation.steps;

import com.demoqa.automation.page.HomePage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.fail;


public class BusquedaProducto{

    HomePage homePage;


    @Step
    public void busquedaProducto(String producto, WebDriver driver){
        driver.findElement(homePage.getSearchs()).sendKeys(producto);
        driver.findElement(homePage.getButtonSearchs()).click();
    }

    @Step
    public void agregarProductoAlCarrito(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getButtonSubmit())).click();
    }

    @Step
    public void productoAgregado(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getMessageAdd()));
       // Assert.assertEquals("Product successfully added to your shopping cart", driver.findElement(homePage.getMessageAdd()).getText().replace("[","").replace("]", ""));
        try {
            Assert.assertTrue(driver.findElement(homePage.getMessageAdd()).getText().contains("Product successfully added to your shopping cart"));
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Resultado exacto!\"}}");

        }
        catch(Exception e) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Resultado no esperado\"}}");
        }
    }

    @Step
    public void resultadoEnBusqueda(String producto, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try
        {
            if((driver.findElements(homePage.getAlerta()).size() == 0)){
                wait.until(ExpectedConditions.presenceOfElementLocated(homePage.product(producto))).click();
            }
        }
        catch(Exception e)
        {
            fail("La busqueda a realizar no tienes resultados");
        }
    }

}
