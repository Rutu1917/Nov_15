package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
  @Test
  public void f() {
   System.out.println("I am in test cases:");
  }
  @Test
  public void f1() {
   System.out.println("I am in test cases:");
  }
  @BeforeMethod
  public void beforeMethod() {
	   System.out.println("I am in Before Method :");
  }

  @AfterMethod
  public void afterMethod() {
	   System.out.println("I am in After method  :");
  }

  @BeforeClass
  public void beforeClass() {
	   System.out.println("I am in Before class:");
  }

  @AfterClass
  public void afterClass() {
	   System.out.println("I am in After class:");
  }

  @BeforeTest
  public void beforeTest() {
	   System.out.println("I am in Before test :");
  }

  @AfterTest
   public void afterTest() {
   System.out.println("I am in After test :");
 }

	  @BeforeSuite
	  public void beforeSuite() {
	  System.out.println("I am in Before Suite:");
	}

  @AfterSuite
  public void afterSuite() {
	   System.out.println("I am in AfterSuite:");
  }

}
