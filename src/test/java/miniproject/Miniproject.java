package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miniproject {

	public static void main(String[] args) {
		
		
		String url ="https://petstore.octoperf.com/actions/Catalog.action";
		
		String cats = "//*[@id='SidebarContent']//child::a[3]";
		
		String productpage = "//tr/td/child::a[text()='FL-DLH-02']";
		
		String ProductId = "productId=FL-DLH-02";
		
		String Addtocart = "(//*[@class='Button' and contains(text(),'Add to Cart')])[1]";
		
		
		String proceedtocheckout = "//form/following::a[contains(text(),'Proceed to Checkout')]";
		
		String EX_Orderform ="https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
		
		
		String login ="//form//following::input[contains(@name,'signon')]";
		
		WebDriver driver ;
		
		
		driver = new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		if(driver.getCurrentUrl().contains("actions")) {
			
			
			driver.findElement(By.xpath(cats)).click();
			
		}if(driver.getCurrentUrl().contains("categoryId=CATS")) {
			
			driver.findElement(By.xpath(productpage)).click();			
		}
		
		if(driver.getCurrentUrl().contains("productId=FL-DLH-02")) {
			
			driver.findElement(By.xpath(Addtocart)).click();
		
		}
		
		
		if(driver.getCurrentUrl().contains("workingItemId=EST-16")) {
			
			
			driver.findElement(By.xpath(proceedtocheckout)).click();
			
		}
		
		
		if(driver.getCurrentUrl().equals(EX_Orderform)) {
			
			
			driver.findElement(By.xpath(login)).click();
			
		}
		
		
		
		
		
		
		
		

	}

}
