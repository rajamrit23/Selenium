package ShoppersStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91773\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("123456");
		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));

		
		//To use action class
		Actions action = new Actions(driver);
		//Call the method
            action.clickAndHold(eye).perform();
            Thread.sleep(2000);
            
            //To Release
            action.release(eye).perform();
            
            
            
            
            
	}

}
