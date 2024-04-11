package test;

import org.testng.annotations.Test;

import pages.HomePage;
import projectBase.Base;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class shaadiregisteraccount extends Base{
	boolean result;
	
  
@Test
  public void varifyregister() {
	  HomePage home =new HomePage();
	   
	  result=home.validatehomepage("Woman"); 
	  
			  if(result) {
		  System.out.println("successfully validated homepage");
		  Reporter.log("successfully validated homepage");
	  }else {
		  System.out.println("failed to validate");
	  }
  } 
  @BeforeTest
  public void beforeTest() {
	  Base base =new Base();
	  base.setupDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  }

}
