package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToclosePOPup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	
	}

}
