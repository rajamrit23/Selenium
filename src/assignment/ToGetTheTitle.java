package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		String Title = driver.getTitle();
		System.out.println(Title);

	}

}
