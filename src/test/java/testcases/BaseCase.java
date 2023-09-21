package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseCase {

	
		@BeforeTest(alwaysRun=true)
		public void beforetest()
		{
			System.out.println(" before test");
		}
		@BeforeMethod(alwaysRun=true)
		public void beforemethod()
		{
			System.out.println(" before method");
		}
		@AfterMethod(alwaysRun=true)
		public void aftermethod()
		{
			System.out.println(" after method");
		}	
	
		@AfterTest(alwaysRun=true)
		public void aftertest()
		{
			System.out.println(" after test");
		}
	
	

}