package Day27_select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectDropDown {

	public static void main(String[] args) throws IOException {

		String url ="https://letcode.in/dropdowns";
		
		String path = "F:\\SELF\\VigneshSelenium\\screenshots\\Dropdowns\\Dropdowns4.jpeg";

	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(url);
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='fruits']"));
		
		Select sc = new Select(dropdown);
		
		//sc.selectByVisibleText("Orange"); // Orange
		
		//sc.selectByIndex(1);// Apple
		
		sc.selectByValue("4");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File (path);
		
		FileUtils.copyFile(src, dest);

		driver.quit();
		
		
		
		
		
		

	}

}
