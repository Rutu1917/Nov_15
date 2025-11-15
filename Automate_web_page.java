package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_web_page{
	public static void main(String[] args) throws InterruptedException  {
		WebDriver fd = new ChromeDriver();
		 fd.get("https:practicetestautomation.com/practice-test-login");
		 fd.manage().window().fullscreen();
		 WebElement we=fd.findElement(By.id("username"));
		 WebElement we1=fd.findElement(By.id("password"));
		 we.click();
		 we.sendKeys("asdad");
		 we.clear();
		 we.sendKeys("sfyj#2t");
		 String s=we.getAttribute("value");
		 System.out.println(s);
		 System.out.println(we.getLocation());
		 System.out.println(we.getSize());
		 System.out.println(we.getTagName());
		 System.out.println(we.getText());
		 System.out.println(we.isDisplayed());
		 System.out.println(we.isEnabled());
		 System.out.println(we.isSelected());

       WebElement we2=fd.findElement(By.id("submit"));
       we2.click();
       WebElement message=fd.findElement(By.id("error"));
       Thread.sleep(2000);
       System.out.println(message.getText());
       
       we.click();
       we.sendKeys("student");
       we1.click();
       we1.sendKeys("#$h4");
       we2.click();
       WebElement message1=fd.findElement(By.id("error"));
       Thread.sleep(2000);
       System.out.println(message1.getText());
       
	   
		 
//		// fd.findElement(By.id("username")).sendKeys("Rutuja");
//		 fd.findElement(By.id("username")).sendKeys("student");
//		 //fd.findElement(By.id("password")).sendKeys("Rutuja");
//		 fd.findElement(By.id("password")).sendKeys("Password123");
//		 Thread.sleep(2000);
//		 fd.findElement(By.id("username")).clear();
//		 Thread.sleep(2000);
//		 fd.findElement(By.id("username")).sendKeys("error");
//		 fd.findElement(By.id("submit")).click();
//		 Thread.sleep(2000);
		 
	}
}
