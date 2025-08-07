package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	    WebDriver driver;
	    By userDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");
	    By logoutBtn = By.xpath("//a[text()='Logout']");

	    public LogoutPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    public void logout() {
	        driver.findElement(userDropdown).click();
	        driver.findElement(logoutBtn).click();
	    }
}


