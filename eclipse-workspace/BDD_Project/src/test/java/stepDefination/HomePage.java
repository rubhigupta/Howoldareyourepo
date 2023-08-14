package stepDefination;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;

public class HomePage extends BasePage {
	
	String yourname = "//label[contains(text(),'Your name')]/..//input";
	String birthday = "//label[contains(text(),'Your birthday')]/..//input";
	
	@Given("^User should open the browser and enter the url \"([^\"]*)\"$")
	public void user_should_open_the_browser_and_enter_the_url(String url) throws Throwable {
		launchApplication(url);
	}

	@Given("^User should enter Your Name \"([^\"]*)\" and Your Birthday \"([^\"]*)\"$")
	public void user_should_enter_Your_Name_and_Your_Birthday(String name, String dob) throws Throwable {
		driver.findElement(By.xpath(yourname)).sendKeys(name);
		driver.findElement(By.xpath(birthday)).sendKeys(dob);
	}

	@When("^User click on Submit btn$")
	public void user_click_on_Submit_btn() throws Throwable {
		submitButton();
		implicitewait(30);
		screenshot();
	}

	@Then("^User should see your Name and Age appears on the Screen$")
	public void user_should_see_your_Name_and_Age_appears_on_the_Screen() throws Throwable {
		boolean verify = driver.findElement(By.xpath("//h1[contains(text(),'Hello')]")).isDisplayed();
		if (verify == true) {
			System.out.println("Welcome to Dashboard page");
		}
	}

	@Then("^Birthday Error message should display$")
	public void birthday_Error_message_should_display() throws Throwable {
		boolean birthdayVal = driver.findElement(By.xpath("//span[@id='help_birthday']")).isDisplayed();
		if (birthdayVal == true) {
			System.out.println("Please Enter Age in valid format");
		}
		else
		{
			System.out.println("Date Entered is in valid format");
		}
	}

	@Then("^Name and Birthday Error message should display$")
	public void name_and_Birthday_Error_message_should_display() throws Throwable {
		boolean val = driver.findElement(By.xpath("//span[@id='help_name']")).isDisplayed();

		if (val == true) {
			System.out.println("Please Enter Name and Birthday in correct format");
		}
		else
		{
			System.out.println("Name and Birthday is in correct format");
		}

	}

	@Then("^Name Error message should display$")
	public void name_Error_message_should_display() throws Throwable {
		boolean val = driver.findElement(By.xpath("//span[@id='help_name']")).isDisplayed();
		if (val == true) {
			System.out.println("Name filed is blank");
		}
		else
		{
			System.out.println("Name field is not blank");
		}
	}

}
