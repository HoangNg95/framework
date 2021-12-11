package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Fbhome;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class fbstepdefinition {
	WebDriver driver;

	
	/* @Before
	public void openbrowser() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\Documents\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			    driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	} */
	
	
	
	@Given("^I want to navigate to facebook$")
	public void i_want_to_navigate_to_facebook() throws Throwable {
			System.out.println("1st step");
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\Documents\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				    driver.get("https://www.facebook.com");
			Thread.sleep(3000);
	}

	@And("^I need to give un \"([^\"]*)\"$")
	public void i_need_to_give_un(String email) throws Throwable {
		Fbhome ob = new Fbhome(driver);
	    ob.email(email);
	}

	@And("^I need to give password \"([^\"]*)\"$")
	public void i_need_to_give_password(String arg1) throws Throwable {
		Fbhome ob = new Fbhome(driver);
		ob.password(arg1);
	}

	@Then("^I need to click on signin button$")
	public void i_need_to_click_on_signin_button() throws Throwable {
	WebElement login=	driver.findElement(By.xpath("//*[@name='login']"));
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", login);
	}
	

	@Given("^reset the password$")
	public void reset_the_password() throws Throwable {
	  driver.findElement(By.xpath("//a[contains(text(),'Forgot pass')]")).click();
	}

	@Then("^I need to put my mobile number \"([^\"]*)\"$")
	public void i_need_to_put_my_mobile_number(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys(arg1);
	}
	
	@After
	public void closebrowser() throws InterruptedException {
	Thread.sleep(10000);
		driver.close();
	}
}
