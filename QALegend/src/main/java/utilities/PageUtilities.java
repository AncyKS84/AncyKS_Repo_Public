package utilities;

import java.lang.module.ModuleDescriptor.Builder;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities 
{
	private WebDriver driver;
	public PageUtilities(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void clickOnElement(WebElement element)
	{
		element.click();
	}
	public void clearTextbox(WebElement textbox)
	{
		textbox.clear();
	}
	public String readText(WebElement element)
	{
		return element.getText();
	}
	public String readAttribute(WebElement element,String attribute)
	{
		return element.getAttribute(attribute);
	}
	public void selectByIndex(WebElement drpDown,int index)
	{
		Select select = new Select(drpDown);
		select.selectByIndex(index);
		
	}
	public void selectByVisibleText(WebElement drpDown,String text)
	{
		Select select = new Select(drpDown);
		select.selectByVisibleText(text);
	}
	public void selectByValue(WebElement drpDown,String value)
	{
		Select select = new Select(drpDown);
		select.selectByValue(value);
	}
	public void dragAndDrop(WebElement source, WebElement dest)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest);
		action.build().perform();
		
	}
	public void mouseOver(WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void rightClick(WebElement element)
	{
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}
	public void esckeyPress()
	{
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE); // to perform key press from keyboard.
		actions.build().perform();

	}
	public void enterkeyPress()
	{
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER); // to perform key press from keyboard.
		actions.build().perform();

	}
	public void downArrowPress()
	{
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.DOWN); // to perform key press from keyboard.
		actions.build().perform();

	}
	public void enterText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	public void checkBoxClick(WebElement chkBox)
	{
		chkBox.click();	

	}
	public void radioButtonSelect(WebElement radiobutton)
	{
		radiobutton.click();

	}
	public void navigatetoChildWindow() 
	{
		String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    Set<String> tabs = driver.getWindowHandles();
	    Iterator<String> I1= tabs.iterator();
	    while(I1.hasNext())
	    {
	    	String childWindow = I1.next();
	    	if(!parent.equals(childWindow))
	    	{
	    		driver.switchTo().window(childWindow);
	    		
	    	}
	    	
	    }
	}
	public void alertAccept()
	{
		driver.switchTo().alert().accept();  
	}
	public void alertDismiss()
	{
		driver.switchTo().alert().dismiss(); 
	}
	public void valueToAlert(String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	public void navigatetoParentWindow() 
	{
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
	public void clickUsingJavaScript(WebElement element)
	{
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].click();",element);

	}
	public void scroll()
	{
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,1000)");

	}
	public void navigateToPage(String page)
	{
		driver.navigate().to(page);
	}
	public void refreshPage()
	{
		driver.navigate().refresh();
	}
	public void backPage()
	{
		driver.navigate().back();
	}
	public void forwardPage()
	{
		driver.navigate().forward();
	}
	
	public boolean isElementEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	public boolean isElementDisplayed(WebElement element)
	{
		return element.isDisplayed();

	}
	
	
	
}
