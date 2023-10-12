package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicit wait 
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		
		// to open the browser
		driver.get("https://www.facebook.com/");
		//address of email textfield
		driver.findElement(By.id("email")).sendKeys("sdfgh");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();

	}

}
