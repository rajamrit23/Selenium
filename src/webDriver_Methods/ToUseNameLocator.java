package webDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		//To use name locator
		
		driver.findElement(By.name("username")).sendKeys("Amritraj23@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Amrit");
	}

}
