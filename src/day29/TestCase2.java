package day29;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day29.pom.LeftMenu;
import day29.pom.RegisterMercuryTours;
import day29.pom.WelcomeMercuryTours;

public class TestCase2 {
	@Test
	public void registerTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		wm.register();
		RegisterMercuryTours rm=PageFactory.initElements(driver,RegisterMercuryTours.class);
		rm.contactInformation();
		LeftMenu lm=PageFactory.initElements(driver,LeftMenu.class);
		lm.home();
		wm.findAFlight("tutorial","tutorial");
	}

}
