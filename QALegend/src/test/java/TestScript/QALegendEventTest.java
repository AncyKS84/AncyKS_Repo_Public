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
		String userName=prop.getProperty("userName");
		String pwd=prop.getProperty("password");
		loginpage.login(userName, pwd);
		homePage.clickOnHomePageEventButton();
		eventpage.clickOnAddEventButton();
		String eventTitle= ExcelUtility.getStringData(1, 0, "Event")+FakerUtility.randomNuberGenerator();
		
		String eventDescription = ExcelUtility.getStringData(1, 1, "Event");
		eventpage.addEvent(eventTitle, eventDescription);
		Assert.assertEquals(eventpage.eventPageSaveButtonStatusChecker(), true);
	}

}
