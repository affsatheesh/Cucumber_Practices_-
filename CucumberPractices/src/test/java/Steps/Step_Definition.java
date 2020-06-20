package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition 
{
	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  WebElement username = driver.findElement(By.id("txtUsername"));
	       username.sendKeys(name);
		
	 
	}
	@Then("^user is typing the password term \"([^\"]*)\"$")
	public void user_is_typing_the_password_term(String pass) throws Throwable {
	       WebElement password = driver.findElement(By.id("txtPassword"));
	      password.sendKeys(pass);
	      driver.findElement(By.id("btnLogin")).click();
	}




}
