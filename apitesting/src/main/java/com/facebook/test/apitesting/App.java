package com.facebook.test.apitesting;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
/**
 * Hello world!
 *
 */

public class App 
{
   public static void main( String[] args )
    {
     /*   System.out.println( "Hello World!" );
   Response io = get ("https://reqres.in/api/users?page=2");
   io.prettyPrint();
   
   int statcode= io.statusCode();
   System.out.println("this is the status code " +statcode);
    
   Assert.assertEquals(statcode, 200);
    

ResponseBody resbody= io.getBody();
      String resbodystring = resbody.asString();
      Assert.assertEquals(resbodystring.contains("Michael"),true,"name is not displaying"); */
	   createuser();}


public static void createuser() {
     
     File fl = new File ("C:\\Users\\hoang\\eclipse workspace 2\\apitesting\\Postbody.json");
     
     Response res= given().contentType(ContentType.JSON).body(fl).post("https://reqres.in/api/users");
     
     System.out.println(res.getBody().asString());
     
    }

    
    }

