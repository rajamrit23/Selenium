package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterInDemoShop {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.className("ico-register")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("FirstName")).sendKeys("Amrit");
	Thread.sleep(1000);
	driver.findElement(By.id("LastName")).sendKeys("Raj");
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("amritraj23000@rediffmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("Password")).sendKeys("Amrit@123");
	Thread.sleep(1000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Amrit@123");
	Thread.sleep(1000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(5000);
	
	driver.quit();
	}

}
