package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get("https://www.facebook.com/");
		//address of email text field using x path attributes
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asdfghj");
		//address of password textfield using x path contains attribute
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("asdf");
		Thread.sleep(3000);
		//address of forgetten password using xpath text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//address of forgetten password using xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
	}

}
