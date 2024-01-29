package advanceSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLeranTesting {  //TestNG class
@Test(priority = 1,invocationCount = 2,threadPoolSize = 2)
public void cricbuzz() {  //TestCase1
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cricbuzz.com/");
	Reporter.log("cricbuzz got launched");  //Teststep
	driver.quit();
}


@Test(priority = 0,invocationCount = 2,threadPoolSize = 2)
public void baskinRobbins() {  //TestCase2
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://baskinrobbinsindia.com/");
	Reporter.log("BaskinRobbins got launched");  //Teststep
	driver.quit();
}


@Test(priority = -1,invocationCount = 1,threadPoolSize = 1)
public void amazon() {  //TestCase3
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Reporter.log("Amazon got Launched");     //Teststep
	driver.quit();
}
}
