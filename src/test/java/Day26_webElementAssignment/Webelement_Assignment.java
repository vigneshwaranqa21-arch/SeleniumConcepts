package Day26_webElementAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webelement_Assignment {

	public static void main(String[] args) {
		
		
		String url = "https://para.testar.org";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String locator1 = "//*[@class='login']/child::input[@name='username']";
		
		WebElement username = driver.findElement(By.xpath(locator1));
		
		String input1 = "Admin123";
		
		username.sendKeys(input1);
		
		String locator2 = "//*[@class='login']/child::input[@name='password']";
		
		WebElement Password = driver.findElement(By.xpath(locator2));
		
		Password.sendKeys("Admin123");
		
		String locator3 = "//*[@class='login']/child::input[contains(@class,'button')]";
		
		WebElement Loginbtn = driver.findElement(By.xpath(locator3));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator3)));
		
		String buttontext = Loginbtn.getText();
			
		
		Loginbtn.click();
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
