package day12;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	
	//setting priority to test cases
	@Test(priority=1)
	public void loginTest()
	{
		
		System.out.println("This is for login app");
	}
	
	@Test(priority=2)
	public static void registrationTest()
	{
		System.out.println("This is for registration");
	}
	//Ignoring test cases
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}
	
	@BeforeMethod
	public void fun()
	{
		System.out.println("abc");
	}

}
