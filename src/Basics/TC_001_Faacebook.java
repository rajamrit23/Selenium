package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_Faacebook {

	public static void main(String[] args) {
		//Expected Data
		String expectedLoginPageTitle= "Facebook-log in or sign up";
		String expectedUsername="Amritraj23@rediffmail.com";
		String expectedPassword="1234567";
		
		//Step 1:- Open the browser
		WebDriver driver= new ChromeDriver(); //Cross Browser Testing
		System.out.println("Browser got launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximize successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 2:- Enter valid URL
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)){
			System.out.println("Successfully navigate to facebook login page");
		}else {
			System.out.println("Failed To navigate to facebook Login page");
		}
		
		//Step 3:- Enter The Username
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualUsername = usernameTextfield.getAttribute("value");
		if(actualUsername.equals(expectedUsername)) {
			System.out.println("Username TextField Successfully accepted data");
		}else {
			System.out.println("Username TexField failed to accepted data");
		}
	    //Step 4:- Enter the password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualPassword = passwordTextfield.getAttribute("value");
		if(actualPassword.equals(expectedPassword)) {
			System.out.println("Password TextField Successfully accepted data");
		}else {
			System.out.println("Password TextField failed to accepted data");
		}
		
		//step:-5 To click on login Button
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		//Step:-6 To Quit the browser
		driver.quit();
		
	}
	

}
