package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.FakerUtility;

import org.testng.annotations.Test;

public class QALegendEventTest extends BaseClass
{
	@Test
	public void addEventTC() throws IOException
	{
		loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		eventpage.clickOnAddEventButton();
		String eventTitle= ExcelUtility.getStringData(1, 0, "Event")+FakerUtility.randomNuberGenerator();
		
		String eventDescription = ExcelUtility.getStringData(1, 1, "Event");
		eventpage.addEvent(eventTitle, eventDescription);
		Assert.assertEquals(eventpage.eventPageSaveButtonStatusChecker(), true);
	}

}
