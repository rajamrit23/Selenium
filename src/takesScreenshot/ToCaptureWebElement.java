package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jiocinema.com/");
		
		File temp = driver.findElement(By.xpath("//img[@class='MuiAvatar-img mui-style-1hy9t21']")).getScreenshotAs(OutputType.FILE);
		File src=new File("C:\\\\Users\\\\91773\\\\Pictures\\\\Screenshots\\jci.png");
		FileHandler.copy(temp, src);
	}

}
