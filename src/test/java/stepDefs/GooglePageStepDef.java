package stepDefs;

import java.io.File;
import java.io.IOException;

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


public class GooglePageStepDef {

	WebDriver driver;
	@Given("User is on google home page")
	public void user_is_on_google_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();
//
	}

	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		String strTitle = driver.getTitle();
		Assert.assertEquals("Java Tutorial - Google Search",strTitle);
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Tutorial");
		searchBox.submit();
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		String strTitle = driver.getTitle();
		Assert.assertEquals("Selenium Tutorial - Google Search",strTitle);
	}
	@When("User search Cypress Tutorial")
	public void user_search_cypress_tutorial() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Cypress Tutorial");
		searchBox.submit();
	}
	@Then("Should display Cypress result page")
	public void should_display_cypress_result_page() {
		String strTitle = driver.getTitle();
		Assert.assertEquals("Cypress Tutorial - Google Search",strTitle);
	}
	@After
	public void attachScreenshot(Scenario scenario) throws IOException {
		TakesScreenshot screen = (TakesScreenshot)driver;
		File scrFile = screen.getScreenshotAs(OutputType.FILE);
		byte[] img= FileUtils.readFileToByteArray(scrFile);
		scenario.attach(img, "image/png", "image1");
	}



}
