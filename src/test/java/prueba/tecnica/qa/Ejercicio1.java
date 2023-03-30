package prueba.tecnica.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Ejercicio1 {
	WebDriver driver;
	// Login Page
	By usernameLocator = By.name("username");
	By passwordLocator = By.name("password");
	By submitBtn = By.tagName("button");

	// Form Page
	By textLocator = By.name("text");
	By numberLocator = By.name("number");
	By dateLocator = By.name("date");
	By submitLocator = By.tagName("button");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://tasks.evalartapp.com/automatization/");
	}

  @Test
  public void firstTest() {
	  WebElement usernameInput = driver.findElement(usernameLocator);
		WebElement passwordInput = driver.findElement(passwordLocator);

		usernameInput.clear();
		passwordInput.clear();

		usernameInput.sendKeys("576289");
		passwordInput.sendKeys("10df2f32286b7120Mi00LTk4MjY3NQ==30e0c83e6c29f1c3");

		WebElement submit = driver.findElement(submitBtn);

		submit.click();

		// Login Form
		///////////////// 1 formulario ///////////////////////////
		clickSelect("8358");
		sendText("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
		sendDate("05-17-2023");
		sendNumber("8");
		submit();

		///////////////// 2 formulario ///////////////////////////

		clickCheckbox(new String[] { "56", "110", "136", "148", "12", "174", "22", "144", "122", "114" });
		clickSelect("-9718283");
		sendText("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		sendNumber("11");
		submit();

		///////////////// 3 formulario ///////////////////////////

		clickCheckbox(new String[] { "96", "112", "12", "28", "152", "72" });
		clickSelect("5519");
		sendNumber("8");
		sendDate("07-19-2023");
		submit();

		/////////////// 4 formulario ///////////////////////////
		sendText("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
		sendNumber("15");
		clickSelect("10035");
		submit();

		/////////////// 5 formulario ///////////////////////////
		clickSelect("5492261");
		sendDate("05-23-2023");
		clickCheckbox(new String[] { "40" });
		clickRadio("-12771");
		submit();

		/////////////// 6 formulario ///////////////////////////
		clickSelect("5492261");
		sendDate("05-23-2023");
		clickCheckbox(new String[] { "40" });
		clickRadio("-12771");
		submit();

		/////////////// 7 formulario ///////////////////////////
		sendDate("01-27-2023");
		clickRadio("1132581");
		sendNumber("14");
		clickSelect("2959759");
		submit();

		/////////////// 8 formulario ///////////////////////////
		clickSelect("188810767064");
		clickRadio("19106");
		clickCheckbox(new String[] { "63", "27" });
		sendNumber("11");
		submit();

		/////////////// 9 formulario ///////////////////////////
		clickSelect("41823");
		sendNumber("12");
		sendText("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		sendDate("01-19-2023");
		submit();

		/////////////// 10 formulario ///////////////////////////
		clickSelect("4595");
		sendDate("05-29-2023");
		clickRadio("-1611737");
		sendText("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		submit();

		/////////////// 11 formulario ///////////////////////////
		sendDate("05-24-2023");
		sendNumber("10");
		sendText("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
		clickCheckbox(new String[] { "80", "50" });
		submit();
  }
 
  @AfterClass
	public void afterClass() {
//		driver.close();
	}

	public void submit() {
		driver.findElement(submitLocator).click();
	}

	public void sendText(String text) {
		driver.findElement(textLocator).sendKeys(text);
	}

	public void sendDate(String date) {
		driver.findElement(dateLocator).sendKeys(date);
	}

	public void sendNumber(String number) {
		driver.findElement(numberLocator).sendKeys(number);
	}

	public void clickSelect(String text) {
		List<WebElement> options = driver.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if (option.getText().equals(text)) {
				option.click();
				;
			}
		}
	}

	public void clickRadio(String text) {
		List<WebElement> radios = driver.findElements(By.name("radio"));
		for (WebElement radio : radios) {
			if (radio.getAttribute("value").equals(text)) {
				radio.click();
				break;
			}
		}
	}

	public void clickCheckbox(String[] array) {
		List<WebElement> inputs = driver.findElements(By.name("checkbox"));
		for (WebElement input : inputs) {
			for (String element : array) {
				if (element.equals(input.getAttribute("value"))) {
					input.click();
				}
			}

		}
	}


}
