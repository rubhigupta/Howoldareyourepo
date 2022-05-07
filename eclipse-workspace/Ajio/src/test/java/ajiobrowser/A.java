package ajiobrowser;

import java.io.IOException;

import org.testng.annotations.Test;

public class A extends SearchedPage{
	
	//TC_4
	
	
@Test(groups = "SmokeTest")
  public void TC_01() throws Exception {
	// launchbrowser();
	  System.out.println("First");
  }
  
  @Test(groups = "SmokeTest")
  public void TC_02() throws InterruptedException, IOException {
	  //launchbrowser();
	  System.out.println("Second");
  }
  
  @Test(groups = "RegressionTest")
  public void TC_03() throws InterruptedException, IOException {
	 // launchbrowser();
	  System.out.println("Third");
  }
  
  @Test(groups = "RegressionTest")
  public void TC_04() throws InterruptedException, IOException {
	 // launchbrowser();
	  System.out.println("Fourth");
  }
}
