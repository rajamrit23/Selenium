package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {

	String expectedResult="Jewelry";
	@Test
	public void toCheckJawelryPage() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Jaweley page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 006 got executed sucessfully", true);
	}
}

