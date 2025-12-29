package Day27_AlertsAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        // Simple Alert
        driver.findElement(By.id("alertBox")).click();
        Alert al = driver.switchTo().alert();
        al.accept();

        // Confirmation Alert
        driver.findElement(By.id("confirmBox")).click();
        al = driver.switchTo().alert();         
        String text = al.getText();
        System.out.println(text);
        al.dismiss();

        // Prompt Alert
     // Prompt Alert
        driver.findElement(By.id("promptBox")).click();
        al = driver.switchTo().alert();

        // Select All (CTRL + A)
        al.sendKeys(Keys.chord(Keys.CONTROL, "a"));

        // Delete existing text
        al.sendKeys(Keys.chord(Keys.DELETE));

        // Enter new text
        al.sendKeys("Vigneshwaran");

        //al.accept();

        //driver.quit();
    }
}
