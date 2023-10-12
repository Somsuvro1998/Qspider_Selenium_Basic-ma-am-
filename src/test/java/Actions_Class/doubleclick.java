package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleclick {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to open the browser
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		// address of plus icon
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.doubleClick(plus).perform();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();

	}

}
