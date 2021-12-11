package commoncode;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class baseclass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	 this.driver= ((baseclass)result.getInstance()).driver;
		try {
			shots("Passed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver= ((baseclass)result.getInstance()).driver;
		try {
			shots("Failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public WebDriver driver;
 
  @BeforeTest (alwaysRun=true)
  @Parameters({"browser", "url"})
  public void beforeTest(String browser, String url) {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\eclipse-workspace\\practicetesting\\drivers\\chromedriver.exe");
		browsers(browser);
		    driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }


  @AfterTest (alwaysRun=true)
  public void afterTest() {
	  driver.close();
  }

  
  public void browsers(String browsername) {
	   if(browsername.equalsIgnoreCase("Chrome")) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\Documents\\drivers\\chromedriver.exe");   
	  driver=new ChromeDriver();    
	   }
	   else if (browsername.equalsIgnoreCase("firefox")) {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\hoang\\Documents\\drivers\\geckodriver.exe");   
	 driver=new FirefoxDriver(); 
	   }
	   else if (browsername.equalsIgnoreCase("edge")) {
	 System.setProperty("webdriver.edge.driver","C:\\Users\\hoang\\Documents\\drivers\\msedgedriver.exe");   
	 driver=new EdgeDriver();  
	   }
	   else {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\eclipse-workspace\\practicetesting\\drivers\\chromedriver.exe");  
	   }
	   }

public void shots(String folder) throws IOException {

	Date d = new Date();

	String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

	
    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(screenshotFile, new File("C:\\Users\\hoang\\Pictures\\"+folder+"\\"+FileName+".png"));

}



}
  
  
  

