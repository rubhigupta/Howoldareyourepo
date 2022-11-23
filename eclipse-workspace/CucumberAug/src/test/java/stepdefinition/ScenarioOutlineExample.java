package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineExample {
	WebDriver driver;
	@Given("^I want to Login with valid credential$")
	public void i_want_to_Login_with_valid_credential() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\JulyBatch\\drivers\\chromedriver104.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}	

	@When("^User enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("^I verify the login Successfully$")
	public void i_verify_the_login_Successfully() throws Throwable {
	    
		System.out.println("Login");
	}


}
