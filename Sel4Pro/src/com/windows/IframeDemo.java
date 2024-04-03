package com.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//*Sngle iframe	
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input")).sendKeys("Hello");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		
		//Multiple /nested iframe
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));

		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("Hello");

		
//		driver.switchTo().frame(driver.findElement(By.xpath("//h5[text()=\"Nested iFrames\"]//following-sibling::div//child::div")));
		Thread.sleep(2002)	;
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HELLO");
		
	}

}
