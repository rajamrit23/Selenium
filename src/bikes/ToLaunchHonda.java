package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHonda {

	@Test(groups = "system")
	public void honda() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		Reporter.log("honda got launched successfully");
		driver.quit();
		
	}
}
