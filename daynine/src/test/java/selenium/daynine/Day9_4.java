package selenium.daynine;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Day9_4 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException{
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String b) {
	  if (b.equals("chrome")){
		  
	  
	  WebDriverManager.chromedriver().setup();
   	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(co);
	 
	  
  }
  else if(b.equals("edge"))
  {
	  
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
  }
  }
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
