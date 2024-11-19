import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionTest {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = new ChromeDriver();
		
		String name = "Amit";
		String email = "amit12@gmail.com";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver, name, email);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
		
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name+",");
		
		String actual = driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText();
		String expected = "You are successfully logged in.";
		
		Assert.assertEquals(actual, expected);
		
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		System.out.println("The Test PASSED Successfully.");
	}
	
	public static String getPassword(WebDriver driver, String name, String email)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']//a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//form/input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//form/input[@placeholder='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("098756432");
		
		driver.findElement(By.xpath("//div/button[@class='reset-pwd-btn']")).click();
		
		String getPass = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] getPassArray = getPass.split("'");
	    String password = getPassArray[1].split("'")[0];
		
		return password;
	}

}
