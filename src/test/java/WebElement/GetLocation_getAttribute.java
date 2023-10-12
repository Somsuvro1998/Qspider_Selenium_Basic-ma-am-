package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation_getAttribute {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// to open the browser
		driver.get("https://www.facebook.com/");
		WebElement emailTf = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(emailTf.getAttribute("placeholder"));
		//using getlocation()
		
		Point coOrdinates = emailTf.getLocation();
		//System.out.println(coOrdinates);
		int x = coOrdinates.getX();
		int y = coOrdinates.getY();
		System.out.println(x);
		System.out.println(y);
	
}
}
