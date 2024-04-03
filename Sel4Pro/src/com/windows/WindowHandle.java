package com.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandle {
	WebDriver driver=new ChromeDriver();
//	public static void main(String[] args) {
	public void windowFunc(String expTitle) {
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Windows.html");
	WebElement click_btn=driver.findElement(By.xpath("//button[text()='    click   ']"));
	
//	WebDriverWait wait=new WebDriverWait(driver,30);
	click_btn.click();
	
	String parentWindow=driver.getWindowHandle();
	
	Set<String> childSet=driver.getWindowHandles();
	
	for(String chWindow:childSet) {
		if(!parentWindow.equals(chWindow)) {
			if(driver.switchTo().window(chWindow).getTitle().equals(expTitle)) {
			driver.switchTo().window(chWindow);
			System.out.println(driver.getTitle());
			
			String currentUrl=driver.getCurrentUrl();
			System.out.println("Current URL is:: "+currentUrl);
			
			driver.close();
			}
			
		
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println("PArent title:: "+driver.getTitle());
	}
	}
	
	public void alertHandle() {
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		WebElement alrt_btn=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		alrt_btn.click();
//		driver.switchTo().alert().accept();
		
		
//		WebElement alrtWithCancel=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//		alrtWithCancel.click();
//		WebElement alertEx=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//		alertEx.click();
//		driver.switchTo().alert().dismiss();
		
		WebElement alrtWithText=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alrtWithText.click();
		WebElement alertEx3=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		alertEx3.click();
//		alertEx3.clear();
		driver.switchTo().alert().sendKeys("hello");
		
				
	
	}
}
