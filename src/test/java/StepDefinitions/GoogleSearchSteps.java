package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(4000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		WebElement e=driver.findElement(By.xpath("//h3[text()='Software testing']"));
		if(e.isDisplayed())
			System.out.println("Test passed");
		else
			System.out.println("Test Failed");
		
	driver.quit();
			
	}



}
