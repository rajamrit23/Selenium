package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement addbutton = driver.findElement(By.id("add"));
		
		
		//To use action class
		Actions action = new Actions(driver);
		//Call the method
		action.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		action.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		action.doubleClick(addbutton).perform();
		Thread.sleep(2000);
		

	}

}
