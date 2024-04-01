package Pagepackagefinal;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expediapage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"multi-product-search-form-1\"]/div/div/div[1]/ul/li[2]/a/span")
	WebElement Flight ;
	@FindBy(xpath="//*[@id=\"search_form_product_selector_flights\"]/div/div[1]/div/ul/li[1]/a/span")
	WebElement Roundtrip ;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[1]/div/div/div[2]/div[1]/button")
	WebElement Leavingfrom ;
	@FindBy(xpath="//*[@id=\"origin_select\"]")
	WebElement Leavingplace ;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/button")
	WebElement Goingto ;
	@FindBy(xpath="//*[@id='destination_select']")
	WebElement Goingplace;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/div/div/div/button")
	WebElement Date ;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/span")
	WebElement months;
	@FindBy(xpath="//*[@id='FlightSearchForm_ROUND_TRIP']/div/div[2]/div/section/div[2]/div/div/div[2]/button")
	WebElement nextmonth;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[2]/table")
	List<WebElement> exdate;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/section/footer/div/button")
	WebElement done;
	@FindBy(xpath="//*[@id='FlightSearchForm_ROUND_TRIP']/div/div[3]/div/div[1]/button")
	WebElement travellers;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[3]/div/div[2]/div/div/section/div[1]/div/div/button[2]/span")
	WebElement adult;
	@FindBy(xpath="//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[3]/div/div[2]/div/div/section/div[2]/div[1]/div/button[2]/span")
	WebElement children;
	@FindBy(xpath="//*[@id=\"age-traveler_selector_children_age_selector-0\"]")
	WebElement childage;
	@FindBy(xpath="//*[@id='travelers_selector_done_button']")
	WebElement done1;		
	public Expediapage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Flightclick()
	   {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Flight.click();
	   }
	public void Roundclick()
	{
	  Roundtrip.click();
	   } 	   
		
		public void Leavingfrom()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  Leavingfrom.click();
		}
		public void Leavingplace(String Place)
		{
		Leavingplace.sendKeys(Place);
		
		}
		public void goingto ()
		   {
		    Goingto.click();
		   }
		public void Goingplace( String Placee)
		{
        Goingplace.sendKeys(Placee);
		}
	
		public void dates() {
			Date.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			while (true)
			{
			WebElement month=months;
			String monthtext=month.getText();
			System.out.println(monthtext);
			if(monthtext.equals("May 2024"))
			{
				break;
			}
			else
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				nextmonth.click();
			}
			}
			List<WebElement>li=  exdate;
			for(WebElement ele: li)
			{
				String date =ele.getText();
				if(date.equals("6"))
				{
					ele.click();
				}
			}
			done.click();
		}
public void travellers ()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 travellers.click(); 
}
public void children()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 children.click();
}
public void childage()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    childage.click();
 WebElement year=childage;
 Select childagedetails=new Select(childage);
 childagedetails.selectByValue("7");
}	
public void done1()
{
	done1.click();
}
public void adult() {
	
	 adult.click();	
}

}
		
