package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowserOpening {
	WebDriver d= new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	
	  Thread.sleep(2000);
	  WebElement we=d.findElement(By.xpath("//input[@name='username']"));
      we.click();
	  we.sendKeys("Admin");
	 // Thread.sleep(2000);
	  
	  WebElement we1=d.findElement(By.xpath("//input[@name='password']"));
	  we1.click();
	  we1.sendKeys("admin123");
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("//button[@type='submit']")).click();
	  //we2.click();
	  	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  d.close();
	  
  }

}
