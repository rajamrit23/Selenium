package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
	@DataProvider(name="cred")
	public String[][] toSendData(){
		String [][] sarr= {
				{"amritraj@gmail.com","77391220"},
				{"amrit@gmai.com","1234567"},
				{"Amritraj1@gmail.com","109245"}
		};
		return sarr;
	}
	@Test(dataProvider="cred")
	public void toLogin(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.quit();
	}

}
