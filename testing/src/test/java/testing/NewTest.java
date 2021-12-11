package testing;

import java.io.IOException;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.ff;

public class NewTest extends baseclass {
	@Test (priority=1)
	  public void f1() throws IOException, InterruptedException {
			ff ob = new ff (driver);
			ob.passreset();
			ob.mobile("1234567890");
			ob.findfblinks();
}
}
