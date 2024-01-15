package com.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	@org.junit.Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("login1")).sendKeys("Rohan");
		
		 driver.findElement(By.id("password")).sendKeys("pass");
		 
		 
		 driver.findElement(By.className("signinbtn")).click();
		 
		 WebElement errELEment = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/p/span"));
		 String errmsg = errELEment.getText();
		 
		 assertEquals(errmsg,"Your security is important!");
		 
		 driver.close();
		 
		
	}
}
