package Day_30_WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabless {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable");
					
		WebElement Table = driver.findElement(By.xpath("//*[@id='countries']"));
		
		List <WebElement> rows = Table.findElements(By.tagName("tr"));
				
		for(WebElement x :rows) {
					
		List <WebElement> cell = x.findElements(By.tagName("td"));
					
			for(WebElement y : cell) {
					
				System.out.println(y.getText()+ "\t");
		
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
