package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	//1.double click
	public void doubleClickProcess(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//2.Right click
	public void RightClick(WebDriver driver,WebElement ele) { 
		Actions a=new Actions(driver); 
		a.contextClick(ele).perform(); 
		}
	//3.drag and drop
	public void DragandDrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform(); }
	//4.implicit
	public void Impwait(WebDriver driver,int time) { 
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
	//5.explicit wait
	public void ExpWait(WebDriver driver,int time,WebElement ele) { 
		WebDriverWait wait=new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(ele)); }
	
	//6.explicit wait
		public void ExpWaitforClick(WebDriver driver,int time,WebElement ele) { 
			WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele)); }
	

}
