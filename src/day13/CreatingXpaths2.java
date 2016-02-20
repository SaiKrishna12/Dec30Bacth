package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatingXpaths2 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://eenadu.net/");
		
	}
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//a[@href='Homeinner.aspx?item=break36']")).click();
	}

}
