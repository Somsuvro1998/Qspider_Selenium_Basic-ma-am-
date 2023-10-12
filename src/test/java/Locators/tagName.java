package Locators;



import java.util.List;

import org.openqa.selenium.By;
//fetch all  the links in a web page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tagName {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();

		// upcating statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (WebElement b : allLinks) {
			System.out.println(b.getText());
		}
	}

}
