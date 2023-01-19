package javaScriptExecutorPractise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingHardCodedCordinates 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //Typecasting
		
		js.executeScript("window.scrollBy(0,500)"); //using execute script method to perform scroll action
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}


//here we are scrolling normally to see how exactly it works.
