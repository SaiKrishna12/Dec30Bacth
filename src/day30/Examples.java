package day30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Examples {

		public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Sleeper.sleepTightInSeconds(4);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//to refresh the page
		js.executeScript("history.go(0)");
		//to capture the title 
		String str=js.executeScript("return document.title;")
				                                   .toString();
		System.out.println(str);
		//to navigate to a page
		js.executeScript("window.location='http://facebook.com'");
		
	}

}
