import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Amit");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amit23@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

		WebElement dropdownStatic = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(dropdownStatic);
		dropdown.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("05/08/2001");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

	}

}