package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.quit();

	}

}
