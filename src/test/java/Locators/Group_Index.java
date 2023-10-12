package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_Index {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get("https://demoapp.skillrary.com/");

		driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
	}

}
