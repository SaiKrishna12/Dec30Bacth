package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClcikonHiddenComponent {
	@Test
	public void HiddenLinkTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement emailus=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		js.executeScript("arguments[0].click();",emailus);
		
	}

}
