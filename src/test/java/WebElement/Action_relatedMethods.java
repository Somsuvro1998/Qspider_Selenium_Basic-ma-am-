package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_relatedMethods {

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
		emailTf.sendKeys("asdfghj");
		Thread.sleep(3000);
		emailTf.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();
		
		

	}

}
