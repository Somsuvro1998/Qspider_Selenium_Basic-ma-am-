package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver();

		// for maximizng
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explict wait
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// to open the browser
		driver.get("https://www.google.com/");
		// address of search text field
		WebElement search = driver.findElement(By.xpath("//textarea[@type='search']"));
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("phone");
		Thread.sleep(3000);
		List<WebElement> allValues = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(3000);
		System.out.println(allValues.size());
		for (WebElement b : allValues) {
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();

	}

}
