package Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// Call take screenshot function
	TakesScreenshot ts = (TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\91773\\Pictures\\Screenshots\\Yz.png");
	FileHandler.copy(temp, des);
	
	}
}
