package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
@Test(priority = 2)
public void logout() {
	Reporter.log("logout to app",true);
}
@Test(priority = 1)
public void login() {
	Reporter.log("login to app",true);
}
}
