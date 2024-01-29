package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("CONTINUE")).click();
		//To handle Alert popup
		
        Alert alertpop = driver.switchTo().alert();
        //alertpop.accept();
        System.out.println(alertpop.getText());
        alertpop.accept();
        alertpop.dismiss();
        
        
        
        
        
        
        
        

	}

}
