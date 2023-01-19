package javaScriptExecutorPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingLocation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement toys=driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));  //finding the element till which we want to scroll and storing that
		
		Point location = toys.getLocation(); //using get location method to find the x,y cordinate values of the above element and storing that in point location as its the return type of location
		int x=location.getX(); //storing the axis values in x and y respectively
		int y=location.getY();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //typeCasting
		js.executeScript("window.scrollBy("+x+","+y+")");  //putting the x and y as a string as the int value wont be recognized.
		Thread.sleep(2000);
		driver.quit();
		
	}

}
