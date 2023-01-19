package poject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactsModule 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
        driver.findElement(By.linkText("Contacts")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Sharma");
        Thread.sleep(1000);
        driver.findElement(By.name("assigntype")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
        driver.findElement(By.linkText("Sign Out")).click();
        driver.quit();
        
	}
}
