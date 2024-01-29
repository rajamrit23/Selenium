package handling_Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		
		//To switch by using int index
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("//iframe[@title='Iframe Example']")).sendKeys("7739122037");
		
		//To switch by using srting id or name
		//driver.switchTo().frame("send-sms-iframe");
		//driver.findElement(By.id("regEmail")).sendKeys("7739122037");
		
		//To switch using Webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("7739122037");
		
		//ToSwitch back bu using parent frame
		//driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		
		//To Switch back by using default frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//click on About Us
		driver.findElement(By.linkText("About Us")).click();
		
		
		
	Thread.sleep(5000);
	driver.quit();
	}

}
