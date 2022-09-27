package stepDefs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UserStepDef2 {

	WebDriver driver;
	@Given("User is test login page")
	public void user_is_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/login");
	}

//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		driver.findElement(By.xpath("//input[@type='text'")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("raduis")).click();
//	}
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}
	
//	//Using datatable as list
//	@When("User enters login credentails")
//	public void user_enters_login_credentails(io.cucumber.datatable.DataTable userCred) {
//	    List<List<String>> data = userCred.asLists();
//	    String strUser = data.get(0).get(0);
//	    String strPwd = data.get(0).get(1);
//	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.className("radius")).click();
//	}
	
	//Using datatable as Map
		@When("User enters login credentails")
		public void user_enters_login_credentails(io.cucumber.datatable.DataTable userCred) {
		    List<Map<String, String>> data =  userCred.asMaps();
		    String strUser = data.get(0).get("username");
		    String strPwd = data.get(0).get("password");
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strUser);
			driver.findElement(By.id("password")).sendKeys(strPwd);
			driver.findElement(By.className("radius")).click();
		}

	@Then("Should display success message")
	public void should_display_success_message() {
	    boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	    Assert.assertTrue(isDisp);
	}
	

	@Then("Should display error page")
	public void should_display_error_page() {
		boolean isError = driver.findElement(By.cssSelector("div.flash.error")).isDisplayed();
	    Assert.assertTrue(isError);  
	}



}
