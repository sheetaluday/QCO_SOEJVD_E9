package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathTraversingmaam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-08/10/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded");  
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
        driver
	}

}
