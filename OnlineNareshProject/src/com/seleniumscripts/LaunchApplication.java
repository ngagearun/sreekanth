package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).sendKeys("250000");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		driver.close();

	}

}
