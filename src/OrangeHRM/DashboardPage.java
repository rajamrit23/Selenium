package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {
	
	    WebDriver driver;
	    By pimMenu = By.xpath("//span[text()='PIM']/parent::a");
	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    public void goToPIM() {
	        Actions actions = new Actions(driver);
	        WebElement pim = driver.findElement(pimMenu);
	        actions.moveToElement(pim).click().build().perform();
	    }
}



