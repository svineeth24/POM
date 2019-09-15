package TestCases;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objectrepository.*;

public class TestCase1 {
	static WebDriver d;
	
	
	
	@Test(priority=1)
	public static void Login() throws IOException, InterruptedException {
		
		
		
	Properties prop = new Properties();
	FileInputStream FIS= new FileInputStream("C:\\Users\\ourfi\\eclipse-workspace\\PageObject\\Properties\\Datafile.properties");
	prop.load(FIS);
	
	
	if (prop.getProperty("Browser").equalsIgnoreCase("Firefox"))
			{
	System.setProperty("webdriver.gecko.driver",prop.getProperty("FirefoxDriver"));
	d= new FirefoxDriver();
	d.get(prop.getProperty("URL"));
	}
	
	else if (prop.getProperty("Browser").equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromeDriver"));
		d= new ChromeDriver();
		d.get(prop.getProperty("URL"));
		
		}
		
	else if (prop.getProperty("Browser").equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver",prop.getProperty("IEDriver"));
		d= new InternetExplorerDriver();
		d.get(prop.getProperty("URL"));
		}
		
	Loginpage lp = new Loginpage();
	lp.Loginn(d);
	Repository rep= new Repository();
	rep.Screenshot(d, "D://Vineeth Testing material//Screenshots//login.png");
	
}
	@BeforeTest
	public static void Shoes() throws IOException {
		
		Shoes sh= new Shoes();
		sh.Search_Shoes(d);
		Repository rep= new Repository();
		rep.Screenshot(d, "D://Vineeth Testing material//Screenshots//cart.png");
	}
	
	@Test(priority=3)
	public static void cartitem() throws AWTException, InterruptedException, IOException {
		Cartitem1 ci= new Cartitem1();
		ci.cart1(d);

		
		
	}
	@Test(dependsOnMethods= {"cartitem"})
	public static void removecartitem1() throws AWTException, InterruptedException {
		Removecartitem rci = new Removecartitem();
		rci.removeitem(d);
	}
	
	
	
}
