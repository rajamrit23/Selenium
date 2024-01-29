package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		String urlofwebpages = driver.getCurrentUrl();
		System.out.println(urlofwebpages);
	}

}
