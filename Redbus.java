package Practice.Questions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.xpath("//div[@class='sc-ifAKCX gLwVlD']//input[@id='src']"));
		from.click();
		from.sendKeys("Chennai");
		Thread.sleep(3000);

		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.id("search_button")).click();   		// searchingggggg button so date section poped 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();

		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//*[@id=\"Layer_1\"]")).click();
		
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeAsyncScript("window.scrollBy(0,200);");
//		
		driver.findElement(By.xpath("//text[contains(@class, 'dateText') and contains(text(), '1')]")).click();
		System.out.println("clicked 1");
		

	}

}

//Alert alert = driver.switchTo().alert();
//alert.accept();