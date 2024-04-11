package Practice.Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomato {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/chennai");
        
        WebElement locationInput = driver.findElement(By.xpath("//input[@placeholder='Chennai']"));
        locationInput.click();
        locationInput.sendKeys("Velacherry");
              
       
        WebElement velacheryOption = driver.findElement(By.xpath("//p[@class='sc-1hez2tp-0 sc-jRnjsG kkFVjg' and text()='Velacherry']"));
        velacheryOption.click();
        
        // Close the browser
        driver.quit();
    }
}
