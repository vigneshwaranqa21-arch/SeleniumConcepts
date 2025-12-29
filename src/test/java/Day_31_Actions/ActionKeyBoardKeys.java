package Day_31_Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyBoardKeys {

	public static void main(String[] args) throws InterruptedException {

		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Actions actions = new Actions(driver);
		
		actions.click(driver.findElement(By.name("username"))).sendKeys("Admin").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		actions.click(driver.findElement(By.name("password"))).sendKeys("admin123").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		actions.click(driver.findElement(By.cssSelector("button[type='submit']"))).perform();
		
		Thread.sleep(6000);
		
		String path =  "F:\\SELF\\VigneshSelenium\\screenshots\\ActionSS\\ActionSS1.png";
		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File(path);
		
		try {
			FileUtils.copyFile(src, des);
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
