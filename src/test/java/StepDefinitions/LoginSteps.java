package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver = null;
	LoginPage login;

	@Given("chrome browser is open")
	public void chrome_browser_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	@Given("user is on loginpage")
	public void user_is_on_loginpage() throws InterruptedException {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(4000);

	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_student_and_password123(String username, String password) throws InterruptedException {
		login = new LoginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
	//	driver.findElement(By.id("username")).sendKeys(username);
	//	driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(4000);

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		login.clickBtn();
	//	driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);

	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		WebElement e=driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
		if(e.isDisplayed())
			System.out.println("Test passed");
		else
			System.out.println("Test Failed");
		
	driver.quit();

	}




}
