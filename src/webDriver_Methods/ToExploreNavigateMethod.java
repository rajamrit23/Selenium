package webDriver_Methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		
		
		//to string url   - another way to open web app
		//driver.navigate().to("https://www.jiocinema.com/");
		
		
		//to URL url  - Another way to open web app
		driver.navigate().to(new URL("https://www.amazon.in/"));
		

		//forward ,back,refresh      -  
		Navigation nav = driver.navigate();
		nav.back();
        Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
        
		nav.refresh();
	}

}
