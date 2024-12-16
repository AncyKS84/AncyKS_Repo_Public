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
	@FindBy(xpath = "//span[text()='Lekshmi Nair']")
	WebElement profileName;
	@FindBy(xpath = "//span[text()='Notes']")
	WebElement homePageNotesButton;
	@FindBy(xpath = "//span[text()='Messages']")
	WebElement homePageMessagesButton;
	@FindBy(xpath = "//span[text()='Clients']")
	WebElement homePageClientsbutton;
	@FindBy(xpath = "//span[text()='Projects']")
	WebElement homePageProjectButton;
	@FindBy (xpath = "//span[text()='All Projects']")
	WebElement allProjectsButton;
	
	
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
	
	public boolean checkforProfileName()
	{
		return pageutilities.isElementDisplayed(profileName);
	}
	
	public void clickOnHomePageNotesButton()
	{
		homePageNotesButton.click();
	}
	public void clickOnHomePageMessageButton()
	{
		homePageMessagesButton.click();
	}
	public void clickOnHomePageClientsButton()
	{
		homePageClientsbutton.click();
	}
	public void clickOnHomePageAllProjectsButton()
	{
		homePageProjectButton.click();
		allProjectsButton.click();
	}
}
