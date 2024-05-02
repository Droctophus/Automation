package groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group {
@Test(priority=1,groups="smoke test")
public void verifyurl() {
	Reporter.log("smoke test case",true);
}
@Test(priority=2,groups="smoke test")
public void verifylogo() {
	Reporter.log("smoke test case",true);
}
@Test(priority=3,groups="functional test")
public void login() {
	Reporter.log("functional test case",true);
}
@Test(priority=4,groups="functional test")
public void logout() {
	Reporter.log("functional test case",true);
}
}
