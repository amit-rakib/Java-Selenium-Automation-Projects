import java.time.Duration;
import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

         
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		String[] arrayItems = {"Brocolli", "Cucumber", "Carrot"};
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
     	List<WebElement> vagisName = driver.findElements(By.cssSelector("h4.product-name"));


     	buyProducts(driver, arrayItems, vagisName);
     	
     	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
     	driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
     	
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));   	
     	driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
     	
     	//driver.findElement(By.className("button.promoBtn")).click();
     	driver.findElement(By.cssSelector("button.promoBtn")).click();


     	
     	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
     	
     	System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
     	
	    
		

	}
	
	public static void buyProducts(WebDriver driver, String[] arrayItems,List<WebElement> vagisName) {
		
		// Arrays need to be converted as list to compare 

		List listItems = Arrays.asList(arrayItems);

	
     	int j = 0;
     	 
     	for(int i = 0; i<vagisName.size(); i++) {
     		 
     		String name = vagisName.get(i).getText();
     		
     		// Brocolli - 1 Kg

     		
     		String updatedName = name.split(" ")[0];
     		System.out.println(updatedName);
     		
     		if(listItems.contains(updatedName)) {
     			j++;
     			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
     			
     			if(j==listItems.size())
     				break;
     			
     		}
     		
     	}
		
		
	}
	
	
	

}