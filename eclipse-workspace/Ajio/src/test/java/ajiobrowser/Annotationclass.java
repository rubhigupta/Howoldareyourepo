package ajiobrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationclass {
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Seedinfotech\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
	}

	@Test
	public void abc()
	{
		System.out.println("Hi this is normal Method");
	}
	
	@Test
	public void abc2()
	{
		System.out.println("Hi this is normal Method");
	}
}
