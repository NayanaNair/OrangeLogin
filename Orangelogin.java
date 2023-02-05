package com.excelr.browserstack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangelogin {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException, InterruptedException
	{
		File src=new File("D:\\ExcelR_Selenium_Sep7\\Hybrid Driven Framework\\src\\com\\excelr\\browserstack\\orange_login.properties");
		FileInputStream objfile=new FileInputStream(src);
		Properties obj=new Properties();
		//java.util.Properties props = new java.util.Properties();
		obj.load(objfile);

		System.out.println("Property class loaded");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);  
	//	driver.findElement(By.xpath(obj.getProperty("orange.login.username"))).sendKeys("Admin");
		driver.findElement(By.xpath(obj.getProperty("orange.login.username"))).sendKeys(obj.getProperty("username"));
		
		//driver.findElement(By.xpath(obj.getProperty("orange.login.password"))).sendKeys("admin123");
		driver.findElement(By.xpath(obj.getProperty("orange.login.password"))).sendKeys(obj.getProperty("password"));
		
		driver.findElement(By.xpath(obj.getProperty("orange.login.button"))).click();
		
		
		
		
		}
	
		
	}


