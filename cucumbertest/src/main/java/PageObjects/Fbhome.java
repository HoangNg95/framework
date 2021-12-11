package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbhome {
public static WebDriver driver;
	
	@FindBy (xpath="//*[contains(text(),'Forgot password')]") WebElement passreset;
	@FindBy (xpath="//input[@placeholder='Mobile number']") WebElement mobile;
	@FindBy (xpath="//input[@id='email']") WebElement email;
	@FindBy (xpath="//input[@id='pass']") WebElement password;
	@FindBy (xpath="//button[@data-testid='royal_login_button']") WebElement login;
	
	public Fbhome(WebDriver driver) {
		Fbhome.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void passreset() {
		passreset.click();
	}
    
	public void email(String n) {
		email.sendKeys(n);
	}
	
	public void password(String n) {
		password.sendKeys(n);
	}
	
	public void login() {
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", login);
	}
	
}

