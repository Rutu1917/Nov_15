package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpDown {
	WebDriver d= new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  d.get("https://practicetestautomation.com/practice-test-login");
	  JavascriptExecutor js=(JavascriptExecutor)d;
	  js.executeScript("window.scrollBy(0,300)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-250)");
	  Thread.sleep(2000);
	  WebElement li=d.findElement(By.xpath("//a[text()='Privacy Policy']"));
	  Thread.sleep(2000);
	  js.executeScript("arguments[0].scrollIntoView(true);",li);
	  li.click();

  }
}
