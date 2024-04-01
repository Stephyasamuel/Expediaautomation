package FinalBasepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclassfinal {

	 protected WebDriver driver;
	@BeforeTest

	public void setup()
	{
			driver=new ChromeDriver();
			driver.get("https://www.expedia.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			
		}
	@AfterTest
	public void postCondition()
	{
		//driver.quit();
	}
	}