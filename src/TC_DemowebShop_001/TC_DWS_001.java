package TC_DemowebShop_001;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{

	String expectedResult="Books";
	@Test
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actualData=driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		//if (actualData.equals(expectedResult)) {
			//Reporter.log("navigated to Books page Successfully",true);
			
		//}else {
			//Reporter.log("failed To navigate to Books page", true);
	//}
		Assert.assertEquals(actualData,expectedResult ,"Failed to navigate");
		
		Reporter.log("TaseCase 001 Executed successfully",true);}
	}

