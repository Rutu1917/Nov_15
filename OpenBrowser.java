package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup drivers
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		
		WebDriver dr = new ChromeDriver();                                   
        WebDriver dr1 = new FirefoxDriver();

       
        dr.get("https://chrome.com");
        dr1.get("https://gmail.com");
        
       
        dr1.manage().window().minimize();
        Thread.sleep(4000);
        dr1.manage().window().maximize();
        Thread.sleep(4000);
        
        
        System.out.println(dr.getTitle());
        System.out.println(dr1.getCurrentUrl());
        
        String s = "https://chrome.com";
        String s1 = "https://gmail.com";
        System.out.println(s.equals(s1));
        
     
        dr.quit();
        dr1.quit();
	}
}
