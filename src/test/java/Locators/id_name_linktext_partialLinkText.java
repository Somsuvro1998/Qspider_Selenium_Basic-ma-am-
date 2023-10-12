package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_name_linktext_partialLinkText {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		//opens the edge browser
		WebDriver driver = new EdgeDriver();
		//maximizing statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		//address of email text field
		driver.findElement(By.id("email")).sendKeys("asdfghjk");
		//address of password textfield
		driver.findElement(By.name("pass")).sendKeys("asdfghj");
		//addrees of login button
		//driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Create a Page")).click();
		//driver.findElement(By.partialLinkText("Create a ")).click();
		driver.findElement(By.partialLinkText("Forgotten ")).click();

	}

}
