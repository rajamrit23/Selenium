package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		loginPage lp = new loginPage(driver);
		lp.getEmailTextField().sendKeys("amritraj2323@gmail.com");
		lp.getPasswordTextField().sendKeys("77391220");
		lp.getLoginButton().click();
		

	}

}
