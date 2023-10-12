package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//address of create an account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
//address od radio button
		WebElement femailRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
		femailRadioBtn.click();
		if(femailRadioBtn.isSelected()) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
