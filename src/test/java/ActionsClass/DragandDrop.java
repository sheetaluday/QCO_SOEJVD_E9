package ActionsClass; // Successfully Executed !!!

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		// to open the browser 
		driver.get( "http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/ ");
		Thread.sleep(4000);
		WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']")); // keep space between block and 1
		WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']")); // same as above
		Actions a=new Actions(driver);
		a.dragAndDrop(block1, block4).perform();
		
		
		
		

	}

}
