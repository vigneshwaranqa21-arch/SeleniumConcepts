package Day25_webdriverAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
		"C:\\Users\\Vigneshsubramaniyan\\Desktop\\Career\\SLA\\SDET\\Selenium- SLA\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	
        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        
        Thread.sleep(2000);
		
		driver.quit();
		
		
// ChromeBrowser - url Check

String url ="https://www.saucedemo.com/";
		
		WebDriver browser = new ChromeDriver();
		
		browser.navigate().to(url);
		
		browser.manage().window().maximize();
		
		String Executedurl =  browser.getCurrentUrl();
	
		
		if(url.equals(Executedurl )) {
			
			System.out.println("Succesfully navigated to that url "+ Executedurl);
			
			
		}else {
			
			System.out.println("Invalid url");
		}
		
		browser.quit();
	
		

		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
