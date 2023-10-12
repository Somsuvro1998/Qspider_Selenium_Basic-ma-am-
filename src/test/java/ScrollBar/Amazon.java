package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to open the browser
		driver.get("https://www.amazon.in/");
		// address of career webelement
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		// downcasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", career);
		Thread.sleep(3000);
		//career.click();
		js.executeScript("arguments[0].click();", career);

	}

}
