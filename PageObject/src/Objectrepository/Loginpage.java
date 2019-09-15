package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

WebDriver d;
			
	static By username = By.id("email");
	static By password = By.id("passwd");
	static By Login =   By.id("SubmitLogin");
	static By Signin = By.xpath("//a[@class='login']");
	static By error= By.xpath("//div[@class='alert alert-danger']");
	

public void Loginn(WebDriver d) throws InterruptedException
{
	this.d = d;
	WebElement one = d.findElement(Signin);
	one.click();
	Thread.sleep(3000);
	d.findElement(username).sendKeys("vineeth.vineeth44@gmail.com");
	d.findElement(password).sendKeys("2291455208");
	d.findElement(Login).click();
	
	
}



}

