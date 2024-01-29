package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayYourFavSong {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/?bp=wgUCEAE%3D");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("aara kabhi hara nahi");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		Thread.sleep(45000);
		driver.quit();
		
	}

}
