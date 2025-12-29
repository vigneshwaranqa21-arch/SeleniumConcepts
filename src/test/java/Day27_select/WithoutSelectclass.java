package Day27_select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutSelectclass {
	
	
	public static void main(String[] args) throws IOException {
		
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		String path ="F:\\\\SELF\\\\VigneshSelenium\\\\screenshots\\\\WithoutSelectclass.png";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		String username = "//*[@name='username']";
		WebElement input1 = driver.findElement(By.xpath(username));
		input1.sendKeys("Admin");
		
		String password = "//*[@name='password']";

		WebElement input2 = driver.findElement(By.xpath(password));
		
		input2.sendKeys("admin123");
		
		String button ="//button[contains(@class,'orangehrm-login-button')]";
		
		WebElement clickable = driver.findElement(By.xpath(button));
		
		clickable.click();
		
	if(driver.getCurrentUrl().contains("/dashboard/index")) {
			
			
		WebElement Adminsection=driver.findElement(By.xpath("(//*[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name')])[1]"));
		
		Adminsection.click();
		
		
		WebElement Employee1= driver.findElement(By.xpath("(//*[contains(@class,'oxd-input oxd-input--active')])[2]"));
		

		Employee1.sendKeys("Admin A");
		
		
		WebElement UserRoleDD = driver.findElement(By.xpath("(//*[contains(@class,'oxd-select-text--after')]//following::i[contains(@class,'oxd-icon bi-caret-down-fill')])[1]"));
		
		UserRoleDD.click();
		
		
		Actions ac = new Actions(driver);
		
		ac.sendKeys(Keys.ARROW_DOWN);
//		ac.sendKeys(Keys.ARROW_DOWN);
//		ac.sendKeys(Keys.ARROW_DOWN);
		ac.sendKeys(Keys.ENTER);
		
		ac.build().perform();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File (path);
		
		FileUtils.copyFile(src, dest);
		
		System.out.print("Admin Selected");
		
		driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
