package testcases;


import org.testng.annotations.Test;


public class HomeLoan extends BaseCase {
		
		
		@Test(dependsOnMethods="test2")
		
		public void test1() {
			System.out.println("Inside home loan test 1");
		}
		@Test(groups= {"sanity","regression"})
		public void test2() {
			System.out.println("Inside home loan test 2");
		}
		
		

}