import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(1000);

        driver.findElement(By.id("checkBoxOption1")).click();


        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

        Thread.sleep(1000);

        driver.findElement(By.id("checkBoxOption1")).click();

  
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println("Number of checkboxes on the page: " + checkboxes.size());

        driver.quit();
    }
}
