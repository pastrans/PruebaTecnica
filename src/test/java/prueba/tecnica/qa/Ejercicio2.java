package prueba.tecnica.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Ejercicio2 {
	WebDriver driver;
	// Login Page
	By usernameLocator = By.name("username");
	By passwordLocator = By.name("password");
	By submitBtn = By.tagName("button");

	// Form Page
	By sumatotalLocator = By.name("modal_answer");
	By btnSumaLocator = By.cssSelector("form > button");
	
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
  public void firstTest() throws InterruptedException {
	//login Page
			WebElement usernameInput = driver.findElement(usernameLocator);
			WebElement passwordInput = driver.findElement(passwordLocator);

			usernameInput.clear();
			passwordInput.clear();

			usernameInput.sendKeys("576289");
			passwordInput.sendKeys("10df2f32286b7120My0zLTk4MjY3NQ==30e0c83e6c29f1c3");

			WebElement submit = driver.findElement(submitBtn);

			submit.click();
			
			
			//Form Page
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//llenado 1 modal
			clickbtn("16");
			waitInput().sendKeys("956");
			enviarResultado();		
			
			//llenado 2 modal
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			clickbtn("86");
			waitInput().sendKeys("1313");
			enviarResultado();		
			
			//llenado 3 modal
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			clickbtn("55");
			waitInput().sendKeys("1194");
			enviarResultado();		
			
			//llenado 4 modal
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			clickbtn("89");
			waitInput().sendKeys("986");
			enviarResultado();		
			
			//llenado 5 modal
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			clickbtn("28");
			waitInput().sendKeys("1617");
			enviarResultado();		
			
			
			//llenado 6 modal
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			clickbtn("135");
			waitInput().sendKeys("1148");
			enviarResultado();		
			
			//llenado 7 modal
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			clickbtn("182");
			waitInput().sendKeys("1422");
			enviarResultado();		
			
			//llenado 8 modal
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			clickbtn("40");
			waitInput().sendKeys("1063");
			enviarResultado();		
			
			//llenado 9 modal
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			clickbtn("138");
			waitInput().sendKeys("1502");
			enviarResultado();		
			
			//llenado 10 modal
			Thread.sleep(3000);
			clickbtn("8");
			waitInput().sendKeys("1249");
			enviarResultado();		
			
			//llenado 11 modal
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			clickbtn("91");
			waitInput().sendKeys("1304");
			enviarResultado();
			
		}

		@AfterClass
		public void afterClass() {
		}
		
		public void clickbtn(String numero ){
			driver.findElement(By.cssSelector("div > button:nth-child("+numero+")")).click();
		}
		public void enviarResultado() {
			driver.findElement(btnSumaLocator).click();
		}
		
		public WebElement waitInput(){
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return  wait.until(ExpectedConditions.visibilityOfElementLocated(sumatotalLocator));
		}
}
