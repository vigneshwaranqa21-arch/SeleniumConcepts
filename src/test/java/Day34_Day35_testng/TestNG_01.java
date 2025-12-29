package Day34_Day35_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



/*
 
  Difference between main() method and @Test
  
  
  1.main() - Java entry point where the code execution starts.
  2.@Test -  @Test Annotation in the TestNG where actual testMethod execution happens
  
  1. main()- will not have reports, Assertions by default.
  2. @Test - have priority , Assertions, reports.
  
  IN automation we only use @Test method not main method.
  
  
  
  Difference between @BeforeTest, @BeforeMethod and explain why these methods are not included in Test Result ?
  
  1. BeforeTest runs once for all the Test methods in a <test> tag
  2. BeforeMethod runs before every test method.
  3. These are just Setup methods not actual Tests
  4. It will not available in the Reports
  5. Test methods with @Test will be Considered.

 */

public class TestNG_01 {

	@Test (priority = 1)
	public void launchBrowser() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Selenium automates browsers')]"));
		
		Assert.assertEquals("Selenium automates browsers. That's it!", ele.getText());
		
		System.out.println("Assertion Successful ");
		
		driver.quit();
		
	}
	
	@Test (priority = 2)
		public void compareStrings(){
		
		String actual = "Selenium";
		
		String expected = "Selenium";
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Strings are equal");
	}
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
