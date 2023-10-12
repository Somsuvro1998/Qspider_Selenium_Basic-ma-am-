package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddendivisionPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
		
		//WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new ChromeDriver();

		// for maximizng
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// to open the browser
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();

	}

}
