package launchapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class launchCalcApp {
	WebDriver driver ;

	public launchCalcApp(WebDriver idriver) {
		this.driver = idriver ;
		PageFactory.initElements(driver, this);
	}

	public void launchCalApp()
	{
		try {
			driver.get("https://www.calculator.net/");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

}
