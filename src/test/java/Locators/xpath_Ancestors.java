package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_Ancestors {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();

		// to open the browser
		driver.get(
				"https://www.amazon.in/s?k=samsung+mobile&crid=1J3SYH60O7VBQ&sprefix=sa%2Caps%2C207&ref=nb_sb_ss_inft-rank-pairwise-override-in-t3_1_2");
		WebElement price = driver.findElement(By.xpath(
				"//span[text()='Samsung Galaxy Z Fold5 5G (ICY Blue, 12GB RAM, 512GB Storage)']/ancestor::div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 sg-col-12-of-24 s-list-col-right']//span[@class='a-price-whole']"));
		System.out.println(price.getText());
	}

}
