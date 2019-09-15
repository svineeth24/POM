 package Objectrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Removecartitem {

	WebDriver d;
	
	static By cartdd= By.xpath("//a[@title='View my shopping cart']");
	static By remove = By.xpath("//a[@class='ajax_cart_block_remove_link']");
	
	
	public void removeitem(WebDriver d) throws AWTException, InterruptedException {
		this.d=d;
		
		Actions action = new Actions(d);
		Thread.sleep(3000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		WebElement cdd= d.findElement(cartdd);
		action.moveToElement(cdd).build().perform();
		
		d.findElement(remove).click();
		
	d.quit();
	
	
	}
	
}
