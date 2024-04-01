package Testpackagefinal;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import FinalBasepackage.Baseclassfinal;
import Pagepackagefinal.Expediapage;


		public class Expediatest extends Baseclassfinal {

		@Test
		public void test()
		{
			Expediapage ob= new Expediapage(driver);
			ob.Flightclick();
		    ob.Roundclick();
		    ob.Leavingfrom();
		    ob.Leavingplace("Delhi");
		    ob.goingto();
	        ob.Goingplace("Dubai");
	        ob.dates();
	        ob.travellers();
	        ob.adult();
	        ob.children();
	        ob.childage();
	        ob.done1();
	        
	    
		}
		}
