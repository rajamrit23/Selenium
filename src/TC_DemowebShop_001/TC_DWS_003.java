package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{

	String expectedResult="Electronics";
	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Electronics page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 003 got executed sucessfully", true);
	}
}
