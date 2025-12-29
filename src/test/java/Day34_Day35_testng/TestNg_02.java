package Day34_Day35_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_02 {

	//DataProvider always returns Object[][] for flexibility.
	
	@DataProvider(name = "cred")
	
	public Object data () {
		
		Object [][] obj = {{"Admin","admin@123"},{"Guppies","Shark"}};
				
		return obj;
	}
	
	@Test(dataProvider = "cred",priority =0,groups ="Regression")
	public void loginTest(String user, String pass){
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys(user);
	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	}
	
	
	@Test(groups="Regression", priority=1)
	public void loginTest(){ System.out.println("Regression executed"); }
	


	@Test(groups="Regression", priority=1)
	public void SmokeTest(){ System.out.println("Smoke executed"); }
}

	
	
