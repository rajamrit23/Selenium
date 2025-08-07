package eBot;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// to fetch data
		FileInputStream file = new FileInputStream("./testData/data.properties");
		// create an object of respective file
		Properties prop = new Properties();
		// call methods
		prop.load(file);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		// AutomationScript
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

		// login to application
		driver.findElement(By.id("initialEmailId")).sendKeys(username);
		driver.findElement(By.id("eStatusNextId")).click();
		driver.findElement(By.id("passwordFieldId")).sendKeys(password);
		driver.findElement(By.id("SignInId")).click();

		boolean flag = driver.findElement(By.id("accountOptionsBtnId")).isDisplayed();
		System.out.println(flag); //assert using test ng to have value true

//		navigate to Intent page
		driver.findElement(By.xpath("//*[@data-sidemenu='intentsitem']")).click();

		String pageHeader = driver.findElement(By.id("headerWithDrop")).getText();
		System.out.println(pageHeader); // assert using testng to have value Intents

//		Thread.sleep(5000);

	}


}
