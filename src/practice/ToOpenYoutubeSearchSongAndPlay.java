package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenYoutubeSearchSongAndPlay {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("atif aslam");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//*[@title='Atif Aslam Songs | Atif Aslam Mashup | Best of Atif Aslam | Love Mashup | Non Stop Bollywood Mashup']")).click();

	}

}
