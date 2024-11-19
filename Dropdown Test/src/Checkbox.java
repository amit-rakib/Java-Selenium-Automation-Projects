import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
