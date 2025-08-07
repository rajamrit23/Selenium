package eBot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01 extends BaseClass {
	String expectedResult="Intents";
	@Test
	public void toCheckintentPage() {
		driver.findElement(By.xpath("//div[@data-sidemenu='manage dataitem']")).click();
		String actualData = driver.findElement(By.xpath("//div[@class='PageTitleHeadercss__TitleContainer-sc-1f0qljj-2 iXopar']")).getText();
         Assert.assertEquals(actualData,expectedResult ,"Failed to navigate");
		
		Reporter.log("TaseCase 001 Executed successfully",true);
	}
}
