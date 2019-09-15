package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Shoes {

	WebDriver d;
	
	static By text = By.xpath("//input[@name='search_query']");
	static By search= By.xpath("//button[@type='submit'] [@name='submit_search']");
	static By dropdown = By.id("selectProductSort");
	

public void Search_Shoes(WebDriver d) {
	
	this.d=d;
	
	d.findElement(text).sendKeys("shoes");
	d.findElement(search).click();
	WebElement dd= d.findElement(dropdown);
	Select dropdown1 = new Select(dd);
	dd.click();
	dropdown1.selectByVisibleText("Product Name: A to Z");
}
}