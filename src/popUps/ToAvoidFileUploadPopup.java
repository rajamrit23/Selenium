package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		// Action class
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		//To Avoid File Upload popup
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\91773\\Downloads\\Apiamrit.pdf");
		
		
		
		
		
		
		
		
		

	}

}
