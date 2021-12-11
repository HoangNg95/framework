package testing;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.ff;

import org.testng.annotations.DataProvider;

public class Testdp extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String mobile) throws InterruptedException {
	  ff ob = new ff(driver);
		ob.passreset();
		ob.mobile(mobile);
		driver.navigate().back();
		Thread.sleep(3000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "0987654321"},
      new Object[] { "5435278423" },
    };
  }
}
