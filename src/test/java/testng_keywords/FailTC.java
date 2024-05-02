package testng_keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTC {
@Test
public void login() {
	Reporter.log("Hello",true);
	Assert.fail();	
}
@Test(dependsOnMethods ={"login"})
public void logout() {
	Reporter.log("Hii...",true);
}
}
