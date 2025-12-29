package Day_29_Waits;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitq {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		Wait <WebDriver> wait = new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(d -> d.findElement(By.xpath("//*[@name='username']")));
		
		element.sendKeys("Admin");
		
		System.out.println("Fluent Wait is Working");
		
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
