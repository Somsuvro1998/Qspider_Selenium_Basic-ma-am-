package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {

	public static void main(String[] args) {
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
		if(emailTf.isDisplayed()) {
			System.out.println("pass");
			emailTf.sendKeys("asdfghj");
		}
		else {
			System.out.println("fail");
		}

	}

}
