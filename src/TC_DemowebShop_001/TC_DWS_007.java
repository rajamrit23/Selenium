package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	
	String expectedResult="Gift Cards";
	@Test
	public void toCheckGiftCardPage() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Gift Cards page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 007 got executed sucessfully", true);
	}

}
