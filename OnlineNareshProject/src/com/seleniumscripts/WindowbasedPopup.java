package com.seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowbasedPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='post-body-4105674242499183386']/div[1]/form/input[10]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\NareshUploadFile.exe");
		

	}

}
