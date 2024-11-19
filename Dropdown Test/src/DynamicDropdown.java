import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
          
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//td[@class='mapbg']//a[@value='BLR'])[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[@class='mapbg']//a[@value='MAA'])[2]")).click();
		
		
	}

}
