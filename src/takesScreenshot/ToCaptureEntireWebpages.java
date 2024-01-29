package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntireWebpages {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiocinema.com/");
		Thread.sleep(2000);
		
		//Takes scrrenshot
		TakesScreenshot ts =(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("C:\\Users\\91773\\Pictures\\Screenshots\\Jc.png");
		FileHandler.copy(temp, src);
	}

}
