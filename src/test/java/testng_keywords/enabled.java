package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class enabled {
@Test
public void m1() {
  Reporter.log("hii",true);
}
@Test
public void m2() {
  Reporter.log("hello",true);
}
}
