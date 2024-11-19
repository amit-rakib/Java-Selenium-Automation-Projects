import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Thread.sleep(2000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(1000);
		  List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		  
		  for(WebElement country: countries) {
			  if(country.getText().equalsIgnoreCase("India")) {
				  country.click();
				  break;
			  }
			  
		  }
	}

}
