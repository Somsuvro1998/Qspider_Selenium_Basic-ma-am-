package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_RobotClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kalam\\OneDrive\\Desktop\\Batches\\QCO-SOEJVD\\QCO_SOEJVD_E9\\src\\main\\resources\\geckodriver.exe");
		//WebDriverManager.edgedriver().setup();
		// opening chrome browser
		WebDriver driver = new FirefoxDriver();
		// maximizing the browser
		driver.manage().window().maximize();
		// implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Robot r=new Robot();
		StringSelection str = new StringSelection("C:\\Resumes\\Sasi_Resume.pdf"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);     
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	
		

	}

}
