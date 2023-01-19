package poject1;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganizationModule 
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
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("accountname")).sendKeys("TCS3");
		Thread.sleep(2000);
		driver.findElement(By.name("assigntype")).click();
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Organizations")).click();
		java.util.List<WebElement> list = driver.findElements(By.linkText("TCS3"));
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals("TCS3"))
			{
				count++;
			}
		}
		if (count==1)
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}



		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Sign Out")).click();
		//Thread.sleep(2000);
       // driver.quit();




	}

}
