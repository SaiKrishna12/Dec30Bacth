package day25.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightConfirmation  extends Constants{
	@Test
	public void confirmTest()
	{
		String expmsg="Your itinerary has been booked!";
		String actmsg=driver.findElement(By.xpath("/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(actmsg.equals(expmsg))
		{
			System.out.println("Tickek booking successfull");
		}
		else
		{
			System.out.println("Tickek booking unsuccessfull");
		}
		driver.close();
	}

}
