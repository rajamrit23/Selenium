package webDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkOnLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(5000);
		driver.findElement(By.id("FirstName")).sendKeys("Amrit");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Raj");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("amritraj23@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("Qspiders");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
