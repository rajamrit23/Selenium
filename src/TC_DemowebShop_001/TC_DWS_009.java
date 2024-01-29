package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_009 extends BaseClass {
	
	String expectedResult="Shopping cart";
	@Test
	public void toCheckShoppingCart() {
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		String actualResult = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();
		if (actualResult.equals(expectedResult)) {
			Reporter.log("navigate to Shopping cart page successfully", true);
			
		}else {
			Reporter.log("failed to navigate ", true);
		}Reporter.log("TestCase 009 got executed sucessfully", true);
	}

}
