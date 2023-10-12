package Locators; // Chatgpt
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathTraversing3 {

	public static void main(String[] args) {
	
		        WebDriverManager.edgedriver().setup();
		        WebDriver driver = new EdgeDriver();

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        WebDriverWait wait = new WebDriverWait(driver, 20);

		        driver.get("https://www.facebook.com/");
		        driver.findElement(By.id("email")).sendKeys("sadas");
		        WebElement login = driver.findElement(By.xpath("//button[@name='login']"));

		        // Use Actions class to move to the element and click
		        Actions actions = new Actions(driver);
		        actions.moveToElement(login).click().perform();

		        // You can also wait for the next page to load if needed
		        // For example, waiting for a specific element on the next page:
		        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("some_element_on_next_page")));

		        // Continue with your test steps on the next page
		    }
	}


