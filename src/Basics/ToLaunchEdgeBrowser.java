package Basics;

import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) {
		
    
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement resume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
	
	
	
	Actions action = new Actions(driver);
	action.scrollToElement(resume);

	//To Avoid File Upload popup
	driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\91773\\Downloads\\Apiamrit.pdf");
	//driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\\\Users\\\\91773\\\\Downloads\\\\Apiamrit.pdf");

	}

}
