package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Play_Song_Youtube {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/results?search_query=players+song");
		
		driver.findElement(By.linkText("Badshah X Karan Aujla - Players (Official Video) | 3:00 AM Sessions")).click();

	}

}
