package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By addEmployeeBtn = By.xpath("//button[text()=' Add ']");
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");

    // Updated locator for Employee List tab (please verify & adjust)
    By employeeListTab = By.xpath("//*[text()=\"Employee List\"]");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        // Initialize explicit wait with 10 seconds timeout
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAddEmployee() {
        wait.until(ExpectedConditions.elementToBeClickable(addEmployeeBtn)).click();
    }

    public void addEmployee(String firstName, String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(saveBtn).click();
       
    }

    public void goToEmployeeList() {
        WebElement employeeListElement = wait.until(ExpectedConditions.elementToBeClickable(employeeListTab));
        employeeListElement.click();
    }
}
