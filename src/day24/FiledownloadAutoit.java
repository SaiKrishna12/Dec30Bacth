package day24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FiledownloadAutoit {

		public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.52.0")).click();
		Sleeper.sleepTightInSeconds(4);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");
	}

}
