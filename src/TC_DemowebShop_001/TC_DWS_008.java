package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass {
	
	String expectedResult="Tricentis";
	@Test
	public void toCheckTricentisPage() {
		driver.findElement(By.linkText("Tricentis")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Tricentis']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Tricentis page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 008 got executed sucessfully", true);
	}

}
