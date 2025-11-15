package com.test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
	WebDriver fd = new ChromeDriver(); 

    fd.get("https://chrome.com");
    Thread.sleep(2000);
    
    fd.get("https://gmail.com"); 
    fd.navigate().back();
    Thread.sleep(2000);
    fd.navigate().forward();
    System.out.println(fd.manage().window().getSize());
    Dimension d= new Dimension(500, 850);
    fd.manage().window().setSize(d);
    

    
    
	}
}
