package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebDriver_Utiliity {
//1.double click
	
	public void doubleClickProcess(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
				a.doubleClick(ele).perform();
	}

	//2.right click

	public void rightClickProcess(WebDriver driver1,WebElement ele1)
	{
		Actions a1=new Actions(driver1);
				a1.contextClick(ele1).perform();
}
	//3.DragnDrop
	public void DragnDrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a1=new Actions(driver);
				a1.dragAndDrop(ele1,ele2).perform();
}
	
	
	//4.Implicit Wait
	public void ImplicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	public void ExplicitWait(WebDriver driver,int time,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, time); 
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void ExplicitWait(WebDriver driver,int time,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, time); 
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}