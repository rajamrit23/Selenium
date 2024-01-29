package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageSourceCode {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://meghanafoods.co.in/");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}

}
