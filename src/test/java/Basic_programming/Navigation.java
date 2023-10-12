package Basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the edge browser
		WebDriver driver = new EdgeDriver();
		//maximizing statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		

	}

}
