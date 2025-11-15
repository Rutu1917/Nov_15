package com.testng;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_property {
  @Test
  public void f() throws IOException {
	  WebDriver d=new ChromeDriver();
	  d.manage().window().fullscreen();
	  Properties p=new Properties();
	  FileReader fr=new FileReader("C:\\Users\\CDAC\\Desktop\\TestNG Progr 25\\TestN\\src\\input.property");
	  p.load(fr);
	  d.get(p.getProperty("url"));
	  
	  d.findElement(By.id("username")).sendKeys(p.getProperty("username"));
      d.findElement(By.id("password")).sendKeys(p.getProperty("password"));
      d.findElement(By.id("submit")).click();
	  
	  }
}
