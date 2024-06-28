package groups_in_testNG;

import org.testng.annotations.Test;

public class Groups_Concepts {
	
	@Test(groups = {"smoke"}) // Groups ensure that only mentioned test(s) type will be executed.
	public void testCase1() {
		
		System.out.println("TC1 logic.");
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void testCase2() {
		
		System.out.println("TC2 logic.");
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void testCase3() {
		
		System.out.println("TC3 logic.");
	}
	
	@Test(groups = "windows.sanity") // group name matters for search and execution
	public void testCase4() {
		
		System.out.println("TC4 logic.");
	}
	
	@Test(groups = "linux.regression")
	public void testCase5() {
		
		System.out.println("TC5 logic.");
	}
	
	@Test(groups = {"regression", "sanity"})
	public void testCase6() {
		
		System.out.println("TC6 logic.");
	}

}
