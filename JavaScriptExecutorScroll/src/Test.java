import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
	     List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	     int sum=0;
	     for(int i = 0; i<values.size(); i++) {
	    	 sum += Integer.parseInt(values.get(i).getText());
	     }
	     
	     System.out.println(sum);
	     
	     String total = driver.findElement(By.xpath("//div[@class='totalAmount']"))
	    		 .getText().split(":")[1].trim();
	     
	      
	      System.out.println(total);
	      
	     int expectedtotal = Integer.parseInt(total);
	     
	     Assert.assertEquals(sum, expectedtotal);

	}

}