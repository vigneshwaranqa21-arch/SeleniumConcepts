package Day_31_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginWithActions {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions ac = new Actions(driver);
		
		ac.click(driver.findElement(By.name("username"))).sendKeys("Admin").build().perform();
		
		ac.click(driver.findElement(By.name("password"))).sendKeys("admin123").build().perform();
		
		ac.click(driver.findElement(By.cssSelector("button[type='submit']"))).build().perform();
		
		System.out.print("login Successful");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
