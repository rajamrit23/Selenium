package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String titleofwebpages = driver.getTitle();
System.out.println(titleofwebpages);
	}

}
