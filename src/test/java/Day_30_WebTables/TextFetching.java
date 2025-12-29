package Day_30_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFetching {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		WebElement ele = driver.findElement(By.xpath("//label[contains(text(),'Click Button to see alert')]"));
		
		System.out.println(ele.getText());
	
		
		
		
		
		
		
		

	}

}
