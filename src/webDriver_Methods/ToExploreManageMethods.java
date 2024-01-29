package webDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethods {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://skillrary.com/");
	
	//To Maximize
	//driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//To Minimize
	//driver.manage().window().minimize();
	
	//To fullScreen
	//driver.manage().window().fullscreen();
	
	//To GetSize
/*Dimension sizeOfBrowser = driver.manage().window().getSize();
System.out.println(sizeOfBrowser);
System.out.println(sizeOfBrowser.getHeight());
System.out.println(sizeOfBrowser.getWidth());*/
	
	//To set size
	//driver.manage().window().setSize(new Dimension(1000,1500));
	
	//ToGetposition
	/*Point Position = driver.manage().window().getPosition();
	System.out.println(Position);
	System.out.println(Position.getX());
	System.out.println(Position.getY());*/
	
	//TosetPosition
	driver.manage().window().setPosition(new Point(190,200));
	}

}
