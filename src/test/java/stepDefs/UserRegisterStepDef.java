package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegisterStepDef {

	WebDriver driver;
	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/samplepagetest/");
	}

	@When("User enters comments")
	public void user_enters_comments(String strComment) {
	   WebElement txtComment =  driver.findElement(By.name("g2599-comment"));
	   txtComment.sendKeys(strComment);
	}

	@Then("User will be registered")
	public void user_will_be_registered() {
	    
	}
}
