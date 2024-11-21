import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(1000);
		
		List<WebElement>  options = driver.findElements(By.xpath("//li[@role='presentation']/a"));
		
		for(int i=0; i<options.size(); i++) {
			if(options.get(i).getText().equalsIgnoreCase("India")) {
				options.get(i).click();
				break;
			}
		}
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("//a[@class='ui-state-default ui-state-active']")).click();
		driver.findElement(By.xpath("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='13']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		for(int j = 0; j<5; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input[value='Done']")).click();
		
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdownNew = new Select(dropdown);
		
		dropdownNew.selectByIndex(1);
		System.out.println(dropdownNew.getFirstSelectedOption().getText());

		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.close();
	}

}
