package Objectrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Cartitem1 {

	
	WebDriver d;

	static By mousedrag = By.xpath("//img[@class='replace-2x img-responsive'] [@alt='Faded Short Sleeve T-shirts']");
	static By cart = By.xpath("//button[@type='submit'] [@class='exclusive']");
	static By continuee = By.cssSelector("span[class='continue btn btn-default button exclusive-medium']");
	
	
	public void cart1(WebDriver d) throws AWTException, InterruptedException {
		this.d=d;
		
		
		WebElement wb= d.findElement(mousedrag);
		
		Actions action = new Actions(d);
		action.moveToElement(wb).click().build().perform();
		//d.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		Thread.sleep(3000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		d.findElement(cart).click();
		
		Thread.sleep(3000);
		d.findElement(continuee).click();
		
	
		
	
	}
	}
