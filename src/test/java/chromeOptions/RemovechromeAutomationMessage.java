package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemovechromeAutomationMessage 
{
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(option); //passing ref variable in driver control
		driver.get("https://www.yatra.com/");
	}

}
