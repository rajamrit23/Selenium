package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHero {

	@Test(groups = "smoke")
	public void hero() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/");
		Reporter.log("hero got launched successfully");
		driver.quit();
		
	}
}
