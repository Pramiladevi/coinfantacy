package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCoinfantacy {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/emailsignup/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("9629937510");
	    driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("pramila");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pramiladevi");
		driver.findElement(By.name("password")).sendKeys("12345@2812");
	
	}

}
