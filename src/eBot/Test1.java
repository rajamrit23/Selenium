package eBot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().fullscreen();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      driver.findElement(By.name("login-button")).click();
     
     Action action = new Action();
     
      action.
      driver.close();
      

	}

}
