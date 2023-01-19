package propertiesPractise;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptforActitime 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
				FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
				
				Properties p=new Properties();
				p.load(fis);
				
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get(p.getProperty("url"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(p.getProperty("timeouts"))));
				
				driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));
				driver.findElement(By.name("pwd")).sendKeys(p.getProperty("pswd"));
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(3000);
				
				
				if(driver.getTitle().contains("Enter"))
					System.out.println("Pass");
				
				else
				
				System.out.println("fail");
				
				
				driver.quit();
				
	}

}
