package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
@Test(invocationCount =5)
public void m1() {
	Reporter.log("naresh it",true);
}
}
