package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaucghBajaj {

	@Test(groups = "smoke")
	public void bajaj() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("bajaj got launched successfully");
		driver.quit();
		
	}
}
