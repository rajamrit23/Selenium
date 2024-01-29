package javaScriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerfromscrollAction {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver(); //Cross Browser Testing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		//driver.get("https://www.google.co.in/");
		//driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		//driver.findElement(By.linkText("Images")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
         WebElement indianflag = driver.findElement(By.xpath("//td[text()='India']"));
		/*for(;;) {
			try {
				driver.findElement(By.xpath("//img[@alt='Fresh Flowers Bouquet Of 8 Red Roses - Roseflower.in']")).click();
				break;
				
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,500");
			
			}
		}*/
		js.executeScript("arguments[0].scrollIntoView(false)",indianflag);
	}

}
