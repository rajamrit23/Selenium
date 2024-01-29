package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{
	
	String expectedResult="Digital downloads";
	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Digital downloads page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 005 got executed sucessfully", true);
	}
}


