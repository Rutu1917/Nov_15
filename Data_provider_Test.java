package com.testng;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Data_provider_Test {
	int count;
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	  WebDriver wd= new ChromeDriver();
	  wd.get("http://practicetestautomation.com/practice-test-login");
	  wd.manage().window().maximize();
	  //Thread.sleep(5000);
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	  wd.findElement(By.id("username")).sendKeys(n);
//	  wd.findElement(By.id("password")).sendKeys(s);
	  //List<WebElement>el= wd.findElements(By.tagName("input"));
	  List<WebElement>el= wd.findElements(By.tagName("a"));
	  System.out.println("The Number Of Textbox: "+el.size());
	  for(WebElement e:el)
	  {
		  System.out.println(e.getText());
	  }
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abcd", "xyzs" },
      new Object[] { "sdhio", "rajd" }, 
    };
  }
}
