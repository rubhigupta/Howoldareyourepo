package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon {
	
	WebDriver driver;
	@Given("^I have to launch Amazon page successfully \"([^\"]*)\"$")
		public void i_have_to_launch_Amazon_page_successfully(String url) throws Throwable {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\JulyBatch\\drivers\\chromedriver104.exe");
		    driver = new ChromeDriver();
		    driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		        
		}

		@When("^User Search an Product \"([^\"]*)\"$")
		public void user_Search_an_Product(String product) throws Throwable {
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(product);
		   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		   driver.switchTo().defaultContent();
		   driver.switchTo().parentFrame();
		}

		@Then("^Product should be successfully display$")
		public void product_should_be_successfully_display() throws Throwable {
		   boolean val = driver.findElement(By.xpath("(//span[contains(text(),'iPhone 13. Superbright. Supercolorful. Supersharp.')])[1]")).isDisplayed();
		   if(val==true)
		   {
			   System.out.println("Product is displaying");
		   }
		   else
		   {
			   System.out.println("Product is not avaialable");
		   }
		}
	

}
