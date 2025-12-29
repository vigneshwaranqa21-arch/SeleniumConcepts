package Day_29_Waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implictwait {

	public static void main(String[] args) {
		
					
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://learning.slainstitute.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

		

	}

}
