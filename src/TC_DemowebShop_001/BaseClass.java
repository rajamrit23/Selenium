package TC_DemowebShop_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	String expectedWelcomePageTitle="Demo Web Shop";
	//@Parameters("browserName")
	@BeforeClass
	public void toLaunch() {
		//if (bname.equalsIgnoreCase("Chrome")) {
			//driver=new ChromeDriver();
		//}else if (bname.equalsIgnoreCase("edge")) {
		//	driver=new EdgeDriver();
		//}
		driver = new ChromeDriver();
		Reporter.log("Browser got Launched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void toLogin() {
	driver.get("https://demowebshop.tricentis.com/");
	String actualWelcomePageTitle = driver.getTitle();
	if (actualWelcomePageTitle.equals(expectedWelcomePageTitle)) {
		Reporter.log("Navigate To demowebshop Successfully",true);
	}else {
		Reporter.log("Failed to navigate demowebshop", true);
	}
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("amritraj2323@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("77391220");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Reporter.log("Navigated to Homepage Succesfully", true);
	}
	
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Successfully logged out",true);
		
	}
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed Successfully",true);
		driver.quit();
		
		
	}
}
