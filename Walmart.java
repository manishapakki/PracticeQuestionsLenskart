package Practice.Questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Walmart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='Press & Hold']")));
		driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();

		
		driver.switchTo().frame(2);		
		Actions actions = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//p[text()='Press & Hold']"));
		
		// Perform click and hold on the button for 2 to 3 seconds
		actions.clickAndHold(button).pause(5000).release().build().perform();

		driver.findElement(By.xpath("//i[@class='ld ld-GridFill pr2']")).click();

	}

}
