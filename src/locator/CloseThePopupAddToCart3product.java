package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseThePopupAddToCart3product {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.woodenstreet.com/");

	for(;;) {

	try {

	driver.findElement(By.id("loginclose1")).click();

	break;

	} catch(Exception e) {

	Thread.sleep(3000);

	}

	}

	driver.findElement(By.linkText("Living")).click();

	driver.findElement(By.partialLinkText("Coffee Tables")).click();

	driver.findElement(By.xpath("//p[@class='cart-btn quickviewaction' and @data-product= '8013']")).click();

	Thread.sleep(2000);

	driver.findElement(By.id("button-cart-buy-now")).click();

	driver.findElement(By.xpath("//div[@class='box-modal_close swpmodal-close' and @data-id='8013']")).click();

	Thread.sleep(3000);


	driver.findElement(By.linkText("Study & Office")).click();

	driver.findElement(By.linkText("Study Tables")).click();

	driver.findElement(By.xpath("//p[@class='cart-btn quickviewaction' and @data-product='24748']")).click();

	Thread.sleep(2000);

	driver.findElement(By.id("button-cart-buy-now")).click();

	driver.findElement(By.xpath("//div[@class='box-modal_close swpmodal-close' and @data-id='24748']")).click(); Thread.sleep(3000);

	driver.findElement(By.linkText("Kids Room")).click();

	driver.findElement(By.partialLinkText("Kids Beds")).click();

	driver.findElement(By.xpath("//p[@class='cart-btn quickviewaction' and @data-product='62145']")).click();

	Thread.sleep(2000);

	driver.findElement(By.id("button-cart-buy-now")).click();

	driver.findElement(By.xpath("//div[@class='box-modal_close swpmodal-close' and @data-id='62145']")).click();

	Thread.sleep(3000);

}
}