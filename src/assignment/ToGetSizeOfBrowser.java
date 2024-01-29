package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
	}

}
