package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToreadDataPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step1-Create obj of fileinputstream
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		//Step2-Create an obj of properties file
		Properties prop = new Properties();
		
		//Step3-call method
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//automation start
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
		
		
		
		
		
	}

}
