package dropDownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToAhndleMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		//Listbox
		WebElement multiListbox = driver.findElement(By.id("cars"));
		
		//handle it by using select
		Select multiSelect = new Select(multiListbox);
		
		//call methods
		System.out.println(multiSelect.isMultiple());
		multiSelect.selectByVisibleText("Free ( 90 ) ");
		multiSelect.selectByIndex(1);
		Thread.sleep(2000);
		
		//deselecting
		multiSelect.deselectAll();
		
		
		
		
		
		
		
		
		
		
		

	}

}
