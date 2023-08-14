package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasePage {

	public static WebDriver driver;

	public void launchApplication(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		implicitewait(20);
	}

	public void screenshot() throws IOException {

		String fileWithPath = "C:\\Users\\hp\\eclipse-workspace\\BDD_Project\\screenshot\\img";
		Date d = new Date();
		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File(fileWithPath + FileName));

	}

	public void submitButton() {

		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	}

	public void implicitewait(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

}
