package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDependentAndIndependent {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/electronics");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']/../..//button[@type=\"button\"]")).click();
	}

}
