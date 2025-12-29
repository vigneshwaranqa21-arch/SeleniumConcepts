package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException { // Checked Exception and Unchecked Exception 
		
		
		String url ="https://www.saucedemo.com/";
		
		String path = "F:\\SELF\\VigneshSelenium\\screenshots\\Sc1.png";
	
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(path);
		
		FileUtils.copyFile(src, dest); // file is not there it will throw IO Exception
		
		System.out.println("Screenshotpath "+path);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
