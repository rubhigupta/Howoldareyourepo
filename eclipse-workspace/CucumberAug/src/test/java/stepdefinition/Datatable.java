package stepdefinition;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Datatable {
	WebDriver driver;
	

	@Given("^User has to click on SignUp$")
	public void user_has_to_click_on_SignUp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\JulyBatch\\drivers\\chromedriver104.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	}

	@When("^User enter SignUp Details$")
	public void user_enter_SignUp_Details(DataTable data) throws Throwable {
	    driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		List<List<String>> list = data.raw();    //
		List<List<String>> listobj = data.raw();
		System.out.println(listobj.get(0).get(0));
		System.out.println(listobj.get(0).get(1));
		System.out.println(listobj.get(1).get(1));
		System.out.println(listobj.get(2).get(2));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(listobj.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(listobj.get(1).get(1));
		
		
		
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}	
	
}
