package Objectrepository;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Repository {

	WebDriver d;
	
	public void Screenshot(WebDriver d, String filepath) throws IOException {
		this.d= d;
		TakesScreenshot scr= ((TakesScreenshot)d);
		File scrfile = scr.getScreenshotAs(OutputType.FILE);
		File destfile = new File(filepath);
		FileUtils.copyFile(scrfile, destfile );
		
	}
	
	
}
