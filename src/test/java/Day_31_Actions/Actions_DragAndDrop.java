package Day_31_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement Source = driver.findElement(By.xpath("//*[@id='node']"));
		
		WebElement Target = driver.findElement(By.xpath("//*[@id='droparea']"));

		Actions ac = new Actions(driver);
		
		ac.scrollToElement(Target).dragAndDrop(Source,Target).build().perform();
		
		WebElement Source1 = driver.findElement(By.xpath("//*[@*='angular']"));
		
		WebElement Target2 = driver.findElement(By.xpath("//*[@id='droparea']"));

		ac.clickAndHold(Source1).moveToElement(Target2).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
