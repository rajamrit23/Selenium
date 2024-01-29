package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownBySelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		//handle by using select class
		Select Sort=new Select(sortBy);
		
		//call method
		Sort.selectByValue("https://demowebshop.tricentis.com/books?orderby=15");
		//is multiple
		System.out.println(Sort.isMultiple());
		
		
		
		
		
		
		

	}

}
