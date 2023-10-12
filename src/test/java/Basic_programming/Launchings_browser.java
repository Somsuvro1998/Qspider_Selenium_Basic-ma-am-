package Basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchings_browser {

	public static void main(String[] args) throws Throwable {
		//edge driver related statement
		WebDriverManager.chromedriver().setup();
		//opens the empty edge browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//maximizing statement
		driver.manage().window().maximize();
		
		

	}

}
