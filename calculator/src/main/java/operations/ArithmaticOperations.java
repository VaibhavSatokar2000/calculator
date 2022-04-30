package operations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArithmaticOperations {
	WebDriver driver ;

	public ArithmaticOperations(WebDriver idriver) {
		this.driver = idriver ;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[@onclick=\"r('+')\"]")
	WebElement plus ;

	@FindBy(xpath="//span[@onclick=\"r('-')\"]")
	WebElement minus ;

	@FindBy(xpath="//span[@onclick=\"r('*')\"]")
	WebElement multiply ;

	@FindBy(xpath="//span[@onclick=\"r('/')\"]")
	WebElement divide ;
	
	@FindBy(xpath="//span[@onclick=\"r('=')\"]")
	WebElement equalTo ;

	@FindBy(xpath="//span[@onclick='r(1)']")
	WebElement one ;

	@FindBy(xpath="//span[@onclick='r(2)']")
	WebElement two ;

	@FindBy(xpath="//span[@onclick='r(3)']")
	WebElement three ;

	@FindBy(xpath="//span[@onclick='r(4)']")
	WebElement four ;

	@FindBy(xpath="//span[@onclick='r(5)']")
	WebElement five ;

	@FindBy(xpath="//span[@onclick='r(6)']")
	WebElement six ;

	@FindBy(xpath="//span[@onclick='r(7)']")
	WebElement seven ;

	@FindBy(xpath="//span[@onclick='r(8)']")
	WebElement eight ;

	@FindBy(xpath="//span[@onclick='r(9)']")
	WebElement nine ;

	@FindBy(xpath="//span[@onclick='r(0)']")
	WebElement zero ;

	@FindBy(xpath="//div[@id='sciOutPut']")
	WebElement output ;


	public void AdditionOfTwoNumbers()
	{
		minus.click();
		two.click();
		three.click();
		four.click();
		two.click();
		three.click();
		four.click();

		plus.click() ;

		three.click();
		four.click();
		five.click();
		three.click();
		four.click();
		five.click();
		
		equalTo.click();
	}


	public void SubOneFromOnother()
	{
		two.click();
		three.click();
		four.click();
		eight.click();
		two.click();
		three.click();

		minus.click() ;

		minus.click() ;
		two.click();
		three.click();
		zero.click();
		nine.click();
		four.click();
		eight.click();
		two.click();
		three.click();
		
		equalTo.click();

	}

	public void MultiOfTwoNumbers()
	{
		four.click();
		two.click();
		three.click();

		multiply.click();

		five.click();
		two.click();
		five.click();
		
		equalTo.click();
	}

	public void DivOfTwoNumbers()
	{
		four.click();
		zero.click();
		zero.click();
		zero.click();

		divide.click();

		two.click();
		zero.click();
		zero.click();
		
		equalTo.click();

	}

	public void getScreenShot(String name)
	{
		File from = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		File to = new File(".//src//test//resources//Screenshots//"+name+".png") ;

		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			e.getMessage() ;
		}
	}

}
