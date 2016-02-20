package day25.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookAFlight  extends Constants{
	@Test
	public void bookaFlighTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		driver.findElement(By.name("creditnumber")).sendKeys("11111111111");
		driver.findElement(By.name("buyFlights")).click();
		
	}

}






