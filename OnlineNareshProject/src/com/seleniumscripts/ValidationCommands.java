package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/?FORM=Z9FD1");
		Thread.sleep(3000);
		
		boolean status =driver.findElement(By.id("b_logo")).isDisplayed();
		if(status== true){
			System.out.println("Element is displated");
		}else{
			System.out.println("Element is not displayed");
		}
		
		driver.close();

	}

}
