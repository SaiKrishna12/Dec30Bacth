package day30;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsExample {
	@Test
	public void reportTest() throws IOException
	{
		ExtentReports reports=new ExtentReports("E:\\Dec30Batch\\WebdriverProject\\src\\com\\qedge\\reports\\myReport.html",true);
		ExtentTest test=reports.startTest("My Sample Test");
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO,"Browser launched");
		driver.get("http://opensource.demo.orangehrm.com/");
		test.log(LogStatus.INFO,"navigated to url");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		test.log(LogStatus.INFO,"Entered the username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		test.log(LogStatus.INFO,"entered the password");
		test.log(LogStatus.INFO,"Browser launched");
		test.log(LogStatus.INFO,"Clicked on login");
		driver.findElement(By.id("btnLogin")).click();
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\desktop\\orangeHRM.png"));
		Sleeper.sleepTightInSeconds(5);
		test.addScreenCapture("c:\\users\\sai\\desktop\\orangeHRM.png");
		reports.endTest(test);
		reports.flush();
		
		
		
	}

}
