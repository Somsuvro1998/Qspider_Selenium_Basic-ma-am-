package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get("https://www.amazon.in/s?k=mobile&crid=3GTUV2NVLKKMK&sprefix=mobile%2Caps%2C218&ref=nb_sb_noss_1");
		WebElement price = driver.findElement(By.xpath(
				"//span[text()='Redmi 12C (Matte Black, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(price.getText());
	}

}
