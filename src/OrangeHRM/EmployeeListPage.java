package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EmployeeListPage {
    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.xpath("//input[@placeholder='Type for hints...']");
    By searchBtn = By.xpath("//button[@type='submit']");
    By employeeRecords = By.xpath("//div[@class='orangehrm-container']//div[@role='row']");

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isEmployeePresent(String name) {
        // Clear and enter search text
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(name);

        driver.findElement(searchBtn).click();

        // Wait until at least one row is visible after search
        wait.until(ExpectedConditions.visibilityOfElementLocated(employeeRecords));

        List<WebElement> rows = driver.findElements(employeeRecords);

        for (int i = 0; i < rows.size(); i++) {
            // Re-fetch the rows to avoid stale element exception
            rows = driver.findElements(employeeRecords);
            WebElement row = rows.get(i);

            if (row.getText().contains(name)) {
                System.out.println("Name Verified: " + name);
                return true;
            }
        }
        return false;
    }
}
