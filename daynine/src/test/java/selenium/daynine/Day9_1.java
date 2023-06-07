package selenium.daynine;



import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Day9_1 {
  @Test(dataProvider = "dp")
  public void add(Integer a, Integer b) {
	  
	  System.out.println(a+b);
  }
  @Test(dataProvider="dp")
  public void sub(Integer a,Integer b) {
	  System.out.println(a-b);
  }
  @Test(dataProvider="dp")
  public void multi(Integer a,Integer b) {
	  System.out.println(a*b);
  }
  @Test(dataProvider="dp")
  public void div(Integer a,Integer b) {
	  System.out.println(a/b);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1,  7},
      new Object[] { 2,  9},
    };
  }
}
