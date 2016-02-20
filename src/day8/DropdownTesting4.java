package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://expedia.co.in");
		driver.findElement(By.id("hotel-1-children")).sendKeys("4");
		driver.findElement(By.id("hotel-destination")).click();
		WebElement block=driver.findElement(By.id("hotel-1-children-ages"));
		List<WebElement>dropdown=block.findElements(By.tagName("select"));
		System.out.println(dropdown.size());
	}

}
