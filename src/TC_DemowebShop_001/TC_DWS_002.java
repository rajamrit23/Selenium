package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{

	String expectedData="Computers";
	@Test
	public void toCheckComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		if (expectedData.equals(actualData)) {
			Reporter.log("Navigate to computers page Successfully", true);
		}else {
			Reporter.log("failed to navigate to computers page", true);
		}
		Reporter.log("TestCase 002 Executed successfully ", true);
	}
}
