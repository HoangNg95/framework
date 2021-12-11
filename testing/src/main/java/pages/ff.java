package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ff {
public static WebDriver driver;
	
	@FindBy (xpath="//*[contains(text(),'Forgot password')]") WebElement passreset;
	@FindBy (xpath="//input[@placeholder='Mobile number']") WebElement mobile;
	
	
	
	
	public ff(WebDriver driver) {
		ff.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void passreset() {
		passreset.click();
	}
	
	public void mobile(String n) {
		mobile.sendKeys(n);
	}
	
	public void findfblinks () {
		List<WebElement> listoflinks= driver.findElements(By.tagName("a"));
		System.out.println("total links " +listoflinks.size());
	for(int i=0;i<listoflinks.size();i++) {
	System.out.println(listoflinks.get(i).getAttribute("href"));
	}
}
}
	



