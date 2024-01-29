package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) {
		//To Change Browser Setting
		ChromeOptions settings = new ChromeOptions();
		//To avoid notifications
		settings.addArguments("--disable-Notifications");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.yatra.com/");

	}

}
