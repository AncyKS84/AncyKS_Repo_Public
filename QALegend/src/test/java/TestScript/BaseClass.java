package TestScript;



import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.ConstantValues;
import pageClasses.QALegendEventPage;
import pageClasses.QALegendHomePage;
import pageClasses.QALegendLoginPage;
import utilities.ExcelUtility;

public class BaseClass 
{
	public WebDriver driver;
	QALegendLoginPage loginpage;
	QALegendHomePage homePage;
	QALegendEventPage eventpage;
	public Properties prop;
	public FileInputStream fis;
	
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void browserinitialization(String browserName) throws Exception
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else
		{
			throw new Exception("InvalidNameException");
		} 
		prop = new Properties();
		fis = new FileInputStream(ConstantValues.USERDATAFILE);
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage =new QALegendLoginPage(driver);
		homePage= new QALegendHomePage(driver);
		eventpage=new QALegendEventPage(driver);		
	}

}
