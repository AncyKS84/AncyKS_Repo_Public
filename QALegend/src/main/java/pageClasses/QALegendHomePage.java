package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class QALegendHomePage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy (xpath  ="//span[text()='Events']")
	WebElement homePageEventButton;
	
	
	
	
	public QALegendHomePage(WebDriver driver) 
	{
		this.driver=driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}




	public void clickOnHomePageEventButton()
	{
		homePageEventButton.click();
	}
}
