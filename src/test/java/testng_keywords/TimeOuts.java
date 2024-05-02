package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOuts {
@Test(timeOut = 10)
public void TC() {
	Reporter.log("Hii..",true);
}
}
