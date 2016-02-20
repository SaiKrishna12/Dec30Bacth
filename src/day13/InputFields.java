package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputFields {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		
	}
	@Test
	public void xpathTest()
	{
		String[] str={"one","two","three","four","five","six","seven","eight"};
		Sleeper.sleepTightInSeconds(4);
		List<WebElement> myinput=driver.findElements(By.xpath
			("//input[@type='text' or @type='password' or @type='email']"));
		System.out.println(myinput.size());
		for(int i=0;i<myinput.size();i++)
		{
			myinput.get(i).sendKeys(str[i]);
		}
		
		
		
		
		
		
		
	}

}
