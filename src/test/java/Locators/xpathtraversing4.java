package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class xpathtraversing4 {

	public static void main(String[] args) {
		

WebDriverManager.edgedriver().setup(); // Fire fox driver
//opens the edge browser
WebDriver driver=new EdgeDriver();
  //maximizing statement.
driver.manage().window().maximize();
//it opens the application
driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_1_2_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=mobiles&requestId=099fb185-17b6-45a1-95ec-b1eaa270a2f9&as-backfill=on");  
driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]/../..//div[@class='_30jeq3 _1_WHN1']"));


	}

}
