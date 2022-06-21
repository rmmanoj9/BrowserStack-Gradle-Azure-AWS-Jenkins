public class DemoQA {
	
/*	public WebDriver driver;
	Local bsLocal = new Local();
	HashMap<String, String> bsLocalArgs = new HashMap<String, String>();

	@Before
	public void setUP() throws Exception {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		bsLocalArgs.put("key", "nbCLqNDYfnFaRXyN9zYe");
		bsLocal.start(bsLocalArgs);
		System.out.println(bsLocal.isRunning());

	//		driver = new RemoteWebDriver(new URL(URL_BROWSERSTACK), caps);
	//	driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();


		driver.get("https://demoqa.com/automation-practice-form");
	}

	@Test
	public void testDemoqa() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,5);

		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement mobile = driver.findElement(By.id("userNumber"));
		WebElement dateBirth = driver.findElement(By.id("dateOfBirthInput"));


		WebElement currentAddres = driver.findElement(By.id("currentAddress"));
		WebElement buttonSubmit = driver.findElement(By.id("submit"));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
		firstName.sendKeys("Francisco");
		lastName.sendKeys("Leon");
		email.sendKeys("javiier.leoon15@gmail.com");
		containsText("Other").click();
		mobile.sendKeys("3004855663");
		dateBirth.click();
		Select moth = new Select (driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		Select year = new Select (driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		Thread.sleep(1000);
		moth.selectByIndex(3);
		Thread.sleep(1000);
		year.selectByValue("1999");
		Thread.sleep(1000);
		dayCalendar("10").click();
		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='subjectsInput']"))).sendKeys("Commerce");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'subjects-auto-complete__menu')]"))).click();

		containsText("Sports").click();
		containsText("Music").click();
		currentAddres.sendKeys("QA");
		//containsText("Select State").click();
		//containsText("NCR").click();
		//containsText("Select City").click();
		//containsText("Delhi").click();
		//buttonSubmit.click();
		Thread.sleep(2000);


	//	Assert.assertTrue(driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed());

	}

	public WebElement containsText(String hobbies) {
		return driver.findElement(By.xpath("//*[contains(text(), '" + hobbies + "')]"));
	}
	public WebElement dayCalendar(String day) {
		return driver.findElement(By.xpath("(//div[@role='option' and text()='"+day+"'])[1]"));
	}
	@After
	public void quitDriver() {
		
		driver.quit();
		
	}*/


}
