package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_010 extends BaseClass{
	
	String expectedResult="My account - Customer info";
	@Test
	public void toCheckWishlist() {
		driver.findElement(By.linkText("My account")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='My account - Customer info']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate wishlist page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 010 got executed sucessfully", true);
	}


}
