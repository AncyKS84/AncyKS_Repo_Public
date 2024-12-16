package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.PageUtilities;

public class QALegendLoginPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;

	@FindBy (id= "email")
	WebElement userNameField;
	@FindBy(id="password")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement signInButton;
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement authenticationFailed;
	@FindBy(xpath = "//a[text()='Sign up']")
	WebElement signupOption;
	@FindBy(id = "first_name")
	WebElement firstNameBox;
	@FindBy(id = "last_name")
	WebElement lastNameBox;
	@FindBy(id = "company_name")
	WebElement companyNameBox;
	@FindBy(id = "email")
	WebElement emailBox;
	@FindBy(id = "password")
	WebElement passwdBox;
	@FindBy(id = "retype_password")
	WebElement retypePasswordBox;
	@FindBy(id = "gender_male")
	WebElement genderMaleRadioButton;
	@FindBy(id = "gender_female")
	WebElement genderFemaleRadioButton;
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signUpButton;
	@FindBy(xpath = "//div[text()='Your account has been created successfully! ']")
	WebElement successfulSignUpMsg;

	public QALegendLoginPage(WebDriver driver)
	{
		this.driver=driver;
		this.pageutilities= new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}





	public void login(String userName,String password)
	{
		pageutilities.enterText(userNameField, userName);
		pageutilities.enterText(passwordField, password);
		pageutilities.clickOnElement(signInButton);
	}
	public boolean checkforInvalidLogin()
	{
		return pageutilities.isElementDisplayed(authenticationFailed);
	}
	public void signupOptionClick()
	{
		pageutilities.clickOnElement(signupOption);
	}
	public void fillsignUpForm(String fName,String lName, String CompName,String email,String pwd)
	{
		 firstNameBox.sendKeys(fName);
		
		 lastNameBox.sendKeys(lName);
		 companyNameBox.sendKeys(CompName);
		 emailBox.sendKeys(email);
		 passwdBox.sendKeys(pwd);
		retypePasswordBox.sendKeys(pwd);
		pageutilities.scroll();
		pageutilities.clickOnElement(genderFemaleRadioButton);
		pageutilities.clickOnElement(signUpButton);
		
	}
	public boolean signupStatus()
	{
		return pageutilities.isElementDisplayed(successfulSignUpMsg);
	}
}

