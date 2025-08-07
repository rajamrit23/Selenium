package eBot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.cricbuzz.com/");
	  driver.navigate().refresh();
	//  System.out.println(title);
	   Thread.sleep(10);
	   driver.quit();
	}

}
