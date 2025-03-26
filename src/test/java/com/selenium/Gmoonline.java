package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Library;

public class Gmoonline extends Library {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		// driver.get("www.google.com");
		driver.get("https://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.name("bSubmit")).click();
		Thread.sleep(5000);
		String UnitPrice = driver.findElement(By.xpath("//table[@cellpadding='4']/tbody/tr[5]/td[3]")).getText();
		System.out.println(UnitPrice);
		String UnitpriceWithOutDoller = UnitPrice.substring(2);
		System.out.println(UnitpriceWithOutDoller);
		driver.findElement(By.name("QTY_SOCKS")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("QTY_SOCKS")).sendKeys("3");
		driver.findElement(By.name("bSubmit")).click();
		

	}

}
