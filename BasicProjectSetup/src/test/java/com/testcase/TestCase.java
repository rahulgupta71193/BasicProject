package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestCase {
 

	 public WebDriver driver;
		
		@BeforeTest
		public void setUp() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\SimpleMavenProject\\chromedriver.exe");
			driver= new ChromeDriver();
			Thread.sleep(5000);
		}
		@Test(priority=1)
		public void doLogin() throws InterruptedException
		{
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();
		}
		@Test(priority=2)
		public void typeInSearch()
		{
			//driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("hello world");
		}
		@Test(priority=3)
		public void makemytrip()
		{
			//driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("hello world");
		}
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	}
