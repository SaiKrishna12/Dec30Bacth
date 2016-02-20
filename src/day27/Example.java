package day27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://providers.amerigroup.com/Pages/PLUTO.aspx");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
	}
			
	
	@Test
	public void Amerigroupcodereview() 
	{
				
		WebElement MKT=driver.findElement(By.xpath("//*[@id='ctl00_WebPartManager_g_e89414e9_31b2_4535_8582_6dce3feb3cf8_DropDownList_market']"));
		Select State=new Select(MKT);		
		State.selectByValue("WA");
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		WebElement LOB=driver.findElement(By.xpath("//*[@id='ctl00_WebPartManager_g_e89414e9_31b2_4535_8582_6dce3feb3cf8_DropDownList_lob']"));
		Select LOBlist=new Select(LOB);		
		LOBlist.selectByValue("CAID");
		Sleeper.sleepTightInSeconds(3);
	}
	@Test
	public void Capture() throws Throwable
	{
		FileInputStream f=new FileInputStream("d:\\Codetest_Amerigroup.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		int rowCount=ws.getLastRowNum();
		System.out.println(rowCount);
		//driver.findElement(By.id("ctl00_WebPartManager_g_e89414e9_31b2_4535_8582_6dce3feb3cf8_Text_cptCode")).
		Sleeper.sleepTightInSeconds(3);
		
		
		
		for(int i=1;i<=rowCount;i++)
		{
			WebElement code=driver.findElement(By.id("ctl00_WebPartManager_g_e89414e9_31b2_4535_8582_6dce3feb3cf8_Text_cptCode"));
			String data=ws.getRow(i).getCell(0).getStringCellValue();
			code.sendKeys(data);
			driver.findElement(By.id("ctl00_WebPartManager_g_e89414e9_31b2_4535_8582_6dce3feb3cf8_Button_Submit")).click();
			Sleeper.sleepTightInSeconds(7);
			String text=driver.findElement(By.id("Group_PrecertRequirementControlWrapper")).getText();
			ws.getRow(i).createCell(1).setCellValue(text);
			driver.findElement(By.id("ctl00_WebPartManager_g_e89414e9_31b2_4535_8582_6dce3feb3cf8_Button_FindAnotherCode")).click();
			
					
		}
		FileOutputStream f1=new FileOutputStream("d:\\Codetest_Amerigroup.xlsx");
		wb.write(f1);
		wb.close();
		

	}

}
