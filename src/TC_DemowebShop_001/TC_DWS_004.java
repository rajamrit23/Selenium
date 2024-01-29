package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{


	String expectedResult="Apparel & Shoes";
	@Test
	public void toApparelPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Apparel & Shoes page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 004 got executed sucessfully", true);
	}
}

