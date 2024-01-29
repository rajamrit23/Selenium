package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByIndexing {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore");
		Thread.sleep(2000);
		//driver.findElement(By.)

	}

}
