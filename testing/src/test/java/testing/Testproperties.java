package testing;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.ff;

public class Testproperties extends baseclass {
  @Test (groups= {"functional"})
  public void f() throws IOException {
	  Properties prop = new Properties();
	  FileInputStream ob = new FileInputStream("C:\\Users\\hoang\\eclipse workspace 2\\testing\\parameters.properties");
	  prop.load(ob);
	
			  
	  String mobile = prop.getProperty("Mobile");
	  System.out.println(mobile);
	  ff ob1 = new ff(driver);
	  
	  ob1.passreset();
		ob1.mobile(mobile);
	
  }
  @Test (groups= {"api"})
  public void f1() throws IOException {
	  Properties prop = new Properties();
	  FileInputStream ob = new FileInputStream("C:\\Users\\hoang\\eclipse workspace 2\\testing\\parameters.properties");
	  prop.load(ob);
	
			  
	  String mobile = prop.getProperty("Mobile");
	  System.out.println(mobile);
	  ff ob1 = new ff(driver);
	  
	  ob1.passreset();
		ob1.mobile(mobile);
	
  }
  
  
}
