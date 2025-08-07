package eBot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	String expectedWelcomePageTitle="Demo Web Shop";
	
	@BeforeClass
	public void toLaunch() {
		
		driver = new ChromeDriver();
		Reporter.log("Browser got Launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void toLogin() {
	driver.get("https://demo-chatbot2go.enterprisebot.co/signin");
	String actualWelcomePageTitle = driver.getTitle();
	if (actualWelcomePageTitle.equals(expectedWelcomePageTitle)) {
		Reporter.log("Navigate To EB AIDA Successfully",true);
	}else {
		Reporter.log("Failed to navigate", true);
	}
	driver.findElement(By.id("initialEmailId")).sendKeys("nishant+tester@enterprisebot.org");
	driver.findElement(By.id("eStatusNextId")).click();
	driver.findElement(By.id("passwordFieldId")).sendKeys("E13_Tester");
	driver.findElement(By.id("SignInId")).click();
}
}
