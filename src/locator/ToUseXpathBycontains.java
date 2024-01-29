package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathBycontains {

	public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 Thread.sleep(3000);
	 driver.findElement(By.partialLinkText("Log in")).click();
	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 Thread.sleep(2000);
	 String errormsg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
	 System.out.println(errormsg);
	 Thread.sleep(2000);
	 driver.quit();
	}

}
