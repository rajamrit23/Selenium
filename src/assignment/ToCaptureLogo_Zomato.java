package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureLogo_Zomato {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/bangalore");
		
		File temp = driver.findElement(By.xpath("//img[@class='sc-yvzia9-6 hxTfPc']")).getScreenshotAs(OutputType.FILE);
		File src= new File ("C:\\Users\\91773\\Pictures\\Screenshots\\Z.png");
		FileHandler.copy(temp, src);
		
		
		
		
	}
}
