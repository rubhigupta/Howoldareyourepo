package ajiobrowser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

public class SearchedPage extends BuynowPage{
	
	public static WebDriver driver;
	@Parameters({"browser"})
	public void launchbrowser(String browser) throws InterruptedException, IOException {
		
		if(browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\Seedinfotech\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(configFileReader("url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(configFileReader("userid"));
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(configFileReader("password"));
		screenshot();
		}
		else if(browser.equals("Firefox"))
		{
			
		}
		
		else
			
		driver.switchTo().alert().accept();        //ok
		driver.switchTo().alert().dismiss();       //cancel
	}

	public void selectdropdownval(String val)
	{
		Select dropval = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		dropval.selectByVisibleText(val);
		driver.findElement(By.linkText("Mega Fashion Weekends")).click();
		driver.findElement(By.partialLinkText("Mega Fashion")).click();
	}


	public void searchitem(String searchitem) throws InterruptedException, IOException
	{
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchitem);
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		screenshot();
		String var = driver.findElement(By.xpath("//span[contains(text(),'0') and @id ='nav-cart-count']")).getText();
		if(var=="0")
		{
			System.out.println(var);
		}
		else
		{
			System.out.println(var);
		}
	}

	public void screenshot() throws IOException
	{
		String destfileWithPath = "C:\\Users\\hp\\eclipse-workspace\\Ajio\\screenshot\\img";
		Date d = new Date();
		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		File srcscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcscreenshot, new File(destfileWithPath + FileName));	
	}

	public void takescreenshot() throws IOException
	{
		String fileWithPath = "C:\\Users\\hp\\eclipse-workspace\\Ajio\\screenshot\\img";
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); 
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void clickrdiobtn()
	{
		try {
			Boolean var = driver.findElement(By.xpath("//a[contains(text(),'Kunalseth')]/../..//input")).isDisplayed();
			if(var)
			{
				driver.findElement(By.xpath("//a[contains(text(),'Aaliyah.Haq')]/../..//input")).click();
			}
		}
		catch(Exception e)
		{
			System.out.println("Value is not avaialble");
		}
	}
	
	
	
	//Config function 
		public static Properties properties;
		public static String propertyFilePath= "config//Configuration.properties";

		public static String configFileReader(String configpropname){
			String value = null;     
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(propertyFilePath));
				properties = new Properties();
				try {
					properties.load(reader);      // to load the whole configuration file
					value = properties.getProperty(configpropname);
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
			}
			return value;		
		}
		
		public void action()
		{
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			action.moveToElement(element).build().perform();
			
			//moveToElement(element).build().perform();
		}
}

