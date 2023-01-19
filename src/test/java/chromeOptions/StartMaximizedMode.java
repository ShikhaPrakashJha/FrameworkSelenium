package chromeOptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartMaximizedMode 
{
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions(); //we have to create an object of chrome options class so that we can use add argument method
		option.addArguments("start-maximized"); //to start the window in maximized mode
		option.addArguments("--disable-notifications"); //to disable notification popup


		WebDriver driver=new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
