package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		WebElement ele=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mi")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("_2yAnYN")).getText());

		
		WebElement pricerange =driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
		
		Select sel=new Select(pricerange);
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.selectByValue("16000");
		Thread.sleep(3000);
		sel.selectByVisibleText("₹25000");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	}

}
