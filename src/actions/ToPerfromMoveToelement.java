package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerfromMoveToelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
       WebElement photomanager = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
       
       //to switch the frame
       driver.switchTo().frame(photomanager);
       //images
       WebElement images1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
        WebElement images2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement images3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
       WebElement images4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
      WebElement gallery = driver.findElement(By.id("gallery"));
      WebElement trashbox = driver.findElement(By.id("trash"));
       
       //To use action class
      //Gallery to trash
       Actions action = new Actions(driver);
       action.dragAndDrop(images1, trashbox).perform();
       Thread.sleep(2000);
      // action.dragAndDrop(images2, trashbox).perform();
      action.moveToElement(images2).clickAndHold().release().perform();
       Thread.sleep(2000);
       action.dragAndDrop(images3, trashbox).perform();
       Thread.sleep(2000);
       action.dragAndDrop(images4, trashbox).perform();
       Thread.sleep(3000);
       
       //Trash to gallery
       action.dragAndDrop(images1, gallery).perform();
       Thread.sleep(2000);
       action.dragAndDrop(images2, gallery).perform();
       Thread.sleep(2000);
       action.dragAndDrop(images3, gallery).perform();
       Thread.sleep(2000);
       action.dragAndDrop(images4, gallery).perform();
       Thread.sleep(2000);


	}

}
