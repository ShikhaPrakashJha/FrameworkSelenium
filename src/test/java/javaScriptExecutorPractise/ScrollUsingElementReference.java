package javaScriptExecutorPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingElementReference 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement toys=driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));  //finding the element till which we want to scroll and storing that 
		                                                                                    //with that element name.
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //typeCasting
		js.executeScript("arguments[0].scrollIntoView(true)",toys);  //putting the x and y as a string as the int value wont be recognized.
		Thread.sleep(2000);
		driver.quit();
	}
}
