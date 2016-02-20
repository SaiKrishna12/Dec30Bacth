package day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingWindowProcesses {

	
	public static void main(String[] args) {
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();
		Sleeper.sleepTight(5);
		WindowsUtils.killByName("eclipse.exe");

	}

}
