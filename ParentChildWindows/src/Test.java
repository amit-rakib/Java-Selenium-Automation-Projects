import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	 
		
	int tag =	driver.findElements(By.tagName("a")).size();
	
	System.out.println(tag);
	
	int footerTag = driver.findElements(By.cssSelector("div[id='gf-BIG'] a")).size();
	
	System.out.println(footerTag);
	
	WebElement smallDriver = driver.findElement(By.xpath("(//ul)[1]"));
		
	int a = smallDriver.findElements(By.tagName("a")).size();
	
	System .out.println(a);
	
    List<WebElement> links = smallDriver.findElements(By.tagName("a"));
    
    
    
    for(int i=0; i<a; i++) {
    	
    	String ckey = Keys.chord(Keys.COMMAND, Keys.ENTER);
    	
    	links.get(i).sendKeys(ckey);
    	Thread.sleep(5000);
    	
    	
    }
    
   Set<String> windows = driver.getWindowHandles();
   
   Iterator<String> it = windows.iterator();
      
   while(it.hasNext())
   {
	   driver.switchTo().window(it.next());
	   String title = driver.getTitle();
	   System.out.println(title);
	   
   }
    
	

		
	}

	

}