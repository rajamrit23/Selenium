package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.linkedin.com/in/rajamrit23/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);//2CCAFEC90EDA5BFFEE0175C44469AA43

	}

}
