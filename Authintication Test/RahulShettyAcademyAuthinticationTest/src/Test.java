import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World!");
		
		
		
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("amit");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form/input[@placeholder='Name']")).sendKeys("Amit");
		driver.findElement(By.xpath("//form/input[@placeholder='Email']")).sendKeys("amit@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder$='Phone Number']")).sendKeys("8956453245");
        
		driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		
		driver.findElement(By.xpath("(//button[normalize-space()='Go to Login'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("amit");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("span:nth-child(1)")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText());
		
	}

}
