package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToCaptureTheErrorMeaasage_colourOfErrorMSG {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		WebElement mouseoverit = driver.findElement(By.linkText("Profile"));
		
		//to use action class
		Actions action = new Actions(driver);
		action.moveToElement(mouseoverit).click().perform();
		driver.findElement(By.linkText("My Profile")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login_submit_btn']")));
		driver.findElement(By.xpath("//button[@name='login_submit_btn']")).click();
		WebElement error = driver.findElement(By.xpath("//p[contains(text(),'Please provide valid email')]"));
		System.out.println(error);
		
		//action.click(login).perform();
		
		
		
		

	}

}
