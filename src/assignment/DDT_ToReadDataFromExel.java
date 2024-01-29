package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_ToReadDataFromExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step1-Create a obj of FileinputStream
		FileInputStream fis = new FileInputStream("./testData/demowebshop.xlsx");
		
		//step 2- create obj of exel type 
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String firstName = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String lastName = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
		String email = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
		String password = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();
		String confirmPassword = wb.getSheet("Sheet1").getRow(5).getCell(0).toString();
		
		//Automation Script
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		//driver.findElement(By.id("register-button")).click();
		

	}

}
