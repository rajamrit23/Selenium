package ShoppersStack;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(10000);
		driver.findElement(By.id("//*[@id=\"loginBtn\"]")).click();
		Thread.sleep(10000);
		driver.quit();
		
	}

}
