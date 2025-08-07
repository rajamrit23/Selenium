package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmployeeManagementTest {
	    WebDriver driver;
	    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(baseUrl);
	       
	    }

	    @Test
	    public void testEmployeeWorkflow() {
	        // Login
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("Admin", "admin123");

	        // Navigate to PIM Module
	        DashboardPage dashboard = new DashboardPage(driver);
	        dashboard.goToPIM();

	        // Add Employees
	        PIMPage pimPage = new PIMPage(driver);
	        String[][] employees = {
	            {"Amit", "Roy"},
	            {"Niki", "Singh"},
	            {"john", "Rock"},
	            {"Nishant", "Viti"}
	        };
	        for (String[] emp : employees) {
	            pimPage.clickAddEmployee();
	            pimPage.addEmployee(emp[0], emp[1]);
	           
	            dashboard.goToPIM();
	        }

	        // Verify Employees in Employee List
	        pimPage.goToEmployeeList();
	        EmployeeListPage listPage = new EmployeeListPage(driver);
	        for (String[] emp : employees) {
	            String fullName = emp[0] + " " + emp[1];
	            Assert.assertFalse(listPage.isEmployeePresent(fullName));
	        }

	        // Logout
	        LogoutPage logoutPage = new LogoutPage(driver);
	        logoutPage.logout();
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	


}
