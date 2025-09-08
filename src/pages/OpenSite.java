package pages;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenSite {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\Rohit Data\\Selenium Practice\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        
        driver.manage().window().maximize();
        try {
        	
        
        	WebElement newWindowBtn=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
        
        	newWindowBtn.click();
        
        	String windowHandles=driver.getWindowHandle();
        
        	driver.switchTo().window(windowHandles);
        	
        	Thread.sleep(5000);
        
        	WebElement inputBoxinNewWindow=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        
        	inputBoxinNewWindow.sendKeys("Arnav");
        
        	Thread.sleep(5000);
        
        	driver.quit();
        }
        catch(Exception e)
        {
        	System.out.println("Exception is"+e);
        	driver.quit();
        }
    }
}
