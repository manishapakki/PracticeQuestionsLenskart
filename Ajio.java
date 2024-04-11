package Practice.Questions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//button[@aria-label='Allow Location']")).click();

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='WOMEN']")))
				.moveToElement(driver.findElement(By.xpath("(//a[text()='BRANDS'])[2]"))).build().perform();


		List<WebElement> All_brands = driver.findElements(By.xpath("//li[@data-test='li-WOMEN']//li[@class='catg inactive-text'][2]//div[@class='items']//span"));
		System.out.println(All_brands.size());
		
				
		act.moveToElement(driver.findElement(By.xpath("(//a[text()='Teamspirit'])[2]"))).click().build().perform();
		

	}

}

//li[@data-test='li-WOMEN']//li[@class='catg inactive-text'][2]//div[@class='items']//span

//.moveToElement(driver.findElement(By.xpath("(//a[text()='Teamspirit'])[2]"))).click()



//Alert alert = driver.switchTo().alert();
//String alertText = alert.getText();
//System.out.println("Alert Text: " + alertText);
//alert.accept();
