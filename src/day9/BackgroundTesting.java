package day9;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class BackgroundTesting {

	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
