package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class QALegendEventPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy (xpath  ="(//a[@title='Add event'])[2]")
	WebElement addeventButton;
	@FindBy (id="title")
	WebElement titleTextBox;
	@FindBy(id="description")
	WebElement descriptionBox;
	@FindBy (id="start_date")
	WebElement startdateBox;
	@FindBy(id="start_time")
	WebElement starttimeBox;
	@FindBy (id="end_date")
	WebElement enddateBox;
	@FindBy (id="end_time")
	WebElement endtimeBox;
	@FindBy (id="location")
	WebElement locationBox;
	@FindBy(id="s2id_event_labels")
	WebElement labelBox;
	@FindBy(id="select2-chosen-1")
	WebElement clientBox;
	@FindBy(id="only_me")
	WebElement radioButtonOnlyMe;
	@FindBy(id="event_recurring")
	WebElement repeatChkBox;
	@FindBy(id="repeat_every")
	WebElement repeatEvery;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
	
	
	
	
	
	
	
	public QALegendEventPage(WebDriver driver) 
	{
		this.driver=driver;
		this.pageutilities= new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}




	public void clickOnAddEventButton()
	{
		pageutilities.clickOnElement(addeventButton);
	}
	
	public void addEvent(String title,String description)
	{
		titleTextBox.sendKeys(title);
		pageutilities.enterText(descriptionBox, description);
		startdateBox.sendKeys("2024-12-30");
		enddateBox.sendKeys("2025-01-28");
		//pageutilities.clickOnElement(saveButton);
			
		
		
	}
	public boolean eventPageSaveButtonStatusChecker()
	{
		return(pageutilities.isElementEnabled(saveButton));
	}
	
	
	
}
