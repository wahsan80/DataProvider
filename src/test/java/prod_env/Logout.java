package prod_env;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout {
	
	@Test
	public void logoutTestProd() {
		
		System.out.println("This is Prod Env logout test.");
		Assert.fail("logout failure");
	}

}
