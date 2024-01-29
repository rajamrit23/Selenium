package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/login/");
	}

}
