package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTestNG {
	
  @Test(priority =3)
  public void login() {
	  System.out.println("I am Log in test case");
  }
  
  @Test(priority =1)
  public void registration() {
	  System.out.println("I am in Registration test case");
  }
  
  @Test(priority =2)
  public void Home() {
	  System.out.println("I am in Home test case");
  }
  
  @Test(priority =4)
  public void LogOut() {
	  throw new SkipException("WE are working");
	  //System.out.println("I am in LogOut test case");
  }

}
