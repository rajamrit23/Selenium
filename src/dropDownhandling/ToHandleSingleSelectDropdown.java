package dropDownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://www.facebook.com/signup");
 
 //
 WebElement dayDropdown = driver.findElement(By.id("day"));//day
 WebElement monthDropdown = driver.findElement(By.id("month"));//month
 WebElement yearDropdown = driver.findElement(By.id("year"));//Year
 
 //To Handling By select class
 Select daySelect = new Select(dayDropdown);
 Select monthSelect = new Select(monthDropdown);
 Select yearSelect = new Select(yearDropdown);
 
 //call methods
 daySelect.selectByIndex(19);
 monthSelect.selectByValue("1");
 yearSelect.selectByVisibleText("2002");
 
 //Every option present in monthDropdown
 
 List<WebElement> allMonths = monthSelect.getOptions();
 for(WebElement month:allMonths) {
	 System.out.println(month.getText());
	 monthSelect.selectByVisibleText(month.getText());
	 Thread.sleep(2000);
 }
 //To check that weather dropdown is single or multiselect
 System.out.println("========================================");
 System.out.println(monthSelect.isMultiple());
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

	}

}
