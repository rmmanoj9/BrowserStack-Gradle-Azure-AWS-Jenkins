package stepdefinitions;

import com.demoqa.automation.models.DatosProducto;
import com.demoqa.automation.steps.BusquedaProducto;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import cucumber.api.Scenario;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class stepdefinitions {
    @Steps
    BusquedaProducto busquedaProducto;

    @Managed
    public static WebDriver driver = getDriver();

    Scenario scenario;
    @Before
    public void scenario(Scenario scenario) {
        this.scenario = scenario;
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        environmentVariables.setProperty("JIRA_TAGS", String.valueOf(scenario.getSourceTagNames()).replace("[","").replace("]","").replace("@",""));
    }

    @Dado("^ingreso a la pagina de automation practice$")
    public void ingresoALaPaginaDeAutomationPractice() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Cuando("^realizo la busqueda de un producto$")
    public void realizoLaBusquedaDeUnProducto(List<DatosProducto> datosProductos) {
        busquedaProducto.busquedaProducto(datosProductos.get(0).getProducto(), driver);
    }

    @Y("^esta tiene algun resultado$")
    public void estaTieneAlgunResultado(List<DatosProducto> datosProductos) {
        busquedaProducto.resultadoEnBusqueda(datosProductos.get(0).getProducto(), driver);
    }

    @Y("^agrego el producto al carrito$")
    public void agregoElProductoAlCarrito() {
        busquedaProducto.agregarProductoAlCarrito(driver);
    }

    @Entonces("^visualizo que se agrega correctamente$")
    public void visualizoQueSeAgregaCorrectamente() {
        busquedaProducto.productoAgregado(driver);
    }
     @After
     public void after(){
         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Resultado exacto!\"}}");
         driver.quit();

     }
}
