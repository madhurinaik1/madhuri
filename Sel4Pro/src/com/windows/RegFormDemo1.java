package com.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegFormDemo1 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	System.out.println("Hello");
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement fname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	WebElement lname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	
	fname.sendKeys("Madhuri");
	lname.sendKeys("Naik");
	
	WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("Aundh  Pune  maharashtra");
	
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("abc@gmail.com");

	WebElement tele=driver.findElement(By.xpath("//input[@type='tel']"));
	tele.sendKeys("5233dd");
	
	WebElement gender=driver.findElement(By.xpath("//input[@value='FeMale']"));
	gender.click();
	
	WebElement chbox1=driver.findElement(By.id("checkbox1"));
	chbox1.click();

}
}
