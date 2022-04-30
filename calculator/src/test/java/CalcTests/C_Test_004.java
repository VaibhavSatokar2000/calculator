package CalcTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.* ;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import launchapp.launchCalcApp;
import operations.ArithmaticOperations;

public class C_Test_004 {
	WebDriver driver ;

	launchCalcApp ca ;
	ArithmaticOperations ao ;

	@BeforeMethod
	public void startup()
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver() ;

		driver.manage().window().maximize();
	}

	@Test
	public void DivisionOfTwoNumbers()
	{
		ca = new launchCalcApp(driver) ;
		ca.launchCalApp();

		ao = new ArithmaticOperations(driver) ;
		try {
			ao.DivOfTwoNumbers();
			ao.getScreenShot("Division");
			
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
