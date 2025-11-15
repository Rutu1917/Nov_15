package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowerMaxi {
	WebDriver d= new ChromeDriver();
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) throws InterruptedException {
	  
	  Thread.sleep(2000);
	  d.get("https://practice.expandtesting.com/login");
	  d.get("https://practice.expandtesting.com/login");
		 JavascriptExecutor js=(JavascriptExecutor)d;
		 js.executeScript("window.scrollBy(0,560)");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-300)");
	  WebElement we=d.findElement(By.xpath("//input[@id='username']"));
	  Thread.sleep(2000);
	  we.click();
	  we.sendKeys(username);
	  
	  
	  WebElement we1=d.findElement(By.xpath("//input[@id='password']"));
	  Thread.sleep(2000);
      we1.click();
	  we1.sendKeys(password);
	  
	  Thread.sleep(2000);  
	  d.findElement(By.xpath("//button[@id='submit-login']")).click();
  }
}
