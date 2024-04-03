package com.windows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement fName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		System.out.println(fName.getAccessibleName());
		System.out.println("Displayed:: "+fName.isDisplayed());
		System.out.println("Enabled:: "+fName.isEnabled());
		System.out.println("selected:: "+fName.isSelected());
		WebElement address=driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		//		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		//		System.out.println(address.getSize());
		//		System.out.println(address.getAccessibleName());
		fName.sendKeys("Shubham");
		//		System.out.println(fName.getText());//prints blank
		System.out.println(address.getAriaRole());
		fName.clear();
		System.out.println(fName.getClass());//Returns class org.openqa.selenium.remote.RemoteWebElement i.e fullyqualified class name
		//		System.out.println(address.getRect());

		Rectangle rect=address.getRect();//Introduce in Selenium 4 insead of getLocation() & getSize() methods of Sel <=3.x versions
		System.out.println("X-axis:: "+rect.x);
		System.out.println("Y-axis:: "+rect.y);
		System.out.println("Element Width :: " + rect.width );
		System.out.println("Element Height :: " + rect.height );
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		System.out.println(" email Accessible Name:: "+email.getAccessibleName());//prints blank
System.out.println("DOM VAlue:: "+email.getDomAttribute("ng-model")); //prints Document Objectmodel Attribute value
//System.out.println("DOM property:: "+email.getDomProperty("ng-model"));
System.out.println("DOM property:: "+email.getDomProperty("class"));//Plz do ask or search

email.getShadowRoot();

	}

}
