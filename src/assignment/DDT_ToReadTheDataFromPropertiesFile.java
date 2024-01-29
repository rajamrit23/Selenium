package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_ToReadTheDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
	//Step1-Create object of FileInputStream
		FileInputStream fis =new FileInputStream("./testData/demoapp.properties");
		
		//Step 2- Create obj of properties type file
		Properties prop = new Properties();
		
		//step 3-call method
		prop.load(fis);
		String url = prop.getProperty("url");
		String Firstname = prop.getProperty("FirstName");
		String Lastname = prop.getProperty("LastName");
		String Email = prop.getProperty("Email");
		String Password = prop.getProperty("Password");
		String confirmPassword = prop.getProperty("Confirmpassword");
		
		//automation script
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.id("register-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
