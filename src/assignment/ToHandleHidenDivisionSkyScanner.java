package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHidenDivisionSkyScanner {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.skyscanner.net/airline/airline-air-india-express-i5.html");
		driver.findElement(By.xpath("//img[@alt='Close']")).click();
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		
	driver.findElement(By.xpath("//option[text()='August 2024']")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='13']")).click();
				break;
			}catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}

}
