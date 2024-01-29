package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledropDownUsingfindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.id("day")).sendKeys("23");
		driver.findElement(By.id("month")).sendKeys("oct");
		driver.findElement(By.id("year")).sendKeys("2000");
		Thread.sleep(3000);
		driver.quit();

	}

}
