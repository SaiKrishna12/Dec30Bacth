package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksTesting5 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://pvrcinemas.com");
		driver.findElement(By.className("modal-skip")).click();
		WebElement general=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
		List<WebElement> links=general.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(7);
			general=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
			links=general.findElements(By.tagName("a"));
		}
	}

}
