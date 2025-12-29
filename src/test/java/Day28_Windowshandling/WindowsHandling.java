package Day28_Windowshandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {


		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        driver.get("https://vinothqaacademy.com/multiple-windows/");

	        // Parent Window ID
	        String parentWindow = driver.getWindowHandle();
	        System.out.println("Parent Window ID : " + parentWindow);
	        System.out.println("Parent Title : " + driver.getTitle());

	        // Click button to open new window
	        driver.findElement(By.name("newbrowserwindow123")).click();

	        // Get all window IDs
	        Set<String> allWindows = driver.getWindowHandles();

	        for (String window : allWindows) {

	            // Switch to child window
	            if (!window.equals(parentWindow)) {
	            	
	                driver.switchTo().window(window);

	                System.out.println("Child Window ID : " + window);
	                System.out.println("Child Title : " + driver.getTitle());

	                // Close child window
	                driver.close();
	            }
	        }

	        // Switch back to parent window
	        driver.switchTo().window(parentWindow);
	        System.out.println("Back to Parent Window");

	        driver.quit();
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


