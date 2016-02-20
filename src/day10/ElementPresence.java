package day10;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresence {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String str=driver.getPageSource();
		if(str.contains("Rajinikanth"))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}
	}

}
