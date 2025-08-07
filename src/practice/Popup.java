package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {
	public static void main(String[] args) {
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(setting);
		driver.get("https://www.freshersworld.com/user/recommended-jobs/FW39597095");
	}

}
