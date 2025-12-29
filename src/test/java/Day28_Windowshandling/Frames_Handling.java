package Day28_Windowshandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Handling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");

        // Switch to Frame 1 
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='frame1']"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inside Frame 1");

        // Come back to main page
        driver.switchTo().defaultContent();

        //  Switch to Frame 2 
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='frame2']"));
        driver.switchTo().frame(frame2);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inside Frame 2");

        // Back to main page
        driver.switchTo().defaultContent();

        driver.quit();
	}

}
