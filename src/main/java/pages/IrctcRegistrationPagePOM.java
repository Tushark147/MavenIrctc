package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class IrctcRegistrationPagePOM extends ExcelLibrary{

	public WebDriver driver;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	public WebElement alertOkButton;
	
	@FindBy(id="userName")
	public WebElement usernameTextField;
	
	@FindBy(id="usrPwd")
	public WebElement passwordTextField;
	
	@FindBy(id="cnfUsrPwd")
	public WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//label[contains(text(),'Select Security Question')]")
	public WebElement securityQuestionDropdown;
	
	@FindBy(xpath="//input[contains(@placeholder,'Security Answer')]")
	public WebElement securityAnswerTextField;
	
	@FindBy(xpath="//label[contains(text(),'Select Preferred Language')]")
	public WebElement preferredLanguageDropdown;
	
	@FindBy(id="firstName")
	public WebElement firstnameTextField;
	
	@FindBy(id="middleName")
	public WebElement middlenameTextField;
	
	@FindBy(id="lastname")
	public WebElement lastnameTextField;
	
	@FindBy(xpath="//label[contains(text(),'Gender')]")
	public WebElement genderLabel;
	
	@FindBy(id="M")
	public WebElement maleRadioButton;
	
	@FindBy(id="F")
	public WebElement femaleRadioButton;
	
	@FindBy(id="T")
	public WebElement transgenderRadioButton;
	
	@FindBy(xpath="//p-calendar[@formcontrolname='dob']")
	public WebElement dateOfBirthTextField;
	
	@FindBy(xpath="//label[contains(text(),'Select Occupation')]")
	public WebElement occupationDropdown;
	
	@FindBy(xpath="//label[contains(text(),'Married')]")
	public WebElement marriedRadioButton;
	
	@FindBy(xpath="//label[contains(text(),'Unmarried')]")
	public WebElement unmarriedRadioButton;
	
	@FindBy(xpath="//select[@formcontrolname='resCountry']")
	public WebElement countryDropdown;
	
	@FindBy(id="email")
	public WebElement emailTextField;
	
	@FindBy(id="mobile")
	public WebElement mobileTextField;
	
	@FindBy(xpath="//select[@formcontrolname='nationality']")
	public WebElement nationalityDropdown;
	
	@FindBy(id="resAddress1")
	public WebElement flatDoorBlockNumTextField;
	
	@FindBy(id="resAddress2")
	public WebElement streetLaneTextField;
	
	@FindBy(id="resAddress3")
	public WebElement areaLocalityTextField;
	
	@FindBy(xpath="//input[contains(@placeholder,'Pin code')]")
	public WebElement pincodeTextField; 
	
	@FindBy(id="resState")
	public WebElement stateTextField;
	
	@FindBy(xpath="//select[@formcontrolname='resCity']")
	public WebElement cityTownDropdown;
	
	@FindBy(xpath="//select[@formcontrolname='resPostOff']")
	public WebElement postofficeDropdown;
	
	@FindBy(id="resPhone")
	public WebElement phoneTextField;
	
	@FindBy(xpath="//label[contains(text(),'No')]")
	public WebElement noCopyResiToOfficeAddressRadioButton;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	public WebElement yesCopyResiToOfficeAddressRadioButton;  
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	public WebElement notARobotCheckbox;
	
	@FindBy(xpath="//input[@formcontrolname='termCondition']")
	public WebElement termsAndConditionsCheckbox;
	
	@FindBy(xpath="//b[contains(text(),'Back')]")
	public WebElement BackButton;
	
	@FindBy(xpath="//b[contains(text(),'REGISTER')]")
	public WebElement registerButton; 
	
	//initialization
	public IrctcRegistrationPagePOM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	/*public void usernameTextFieldMethod()
	{
		usernameTextField.sendKeys("Tushar");
	}
	
	public void passwordTextFieldMethod()
	{
		passwordTextField.sendKeys("tushar122");
	}
	
	public void confirmPasswordTextFieldMethod()
	{
		confirmPasswordTextField.sendKeys("Tushar122");
	}
	public void securityQuestionDropdownMethod()
	{
		securityQuestionDropdown.click();
	}
	public void securityAnswerTextFieldMethod()
	{
		securityAnswerTextField.sendKeys("Kuch");
	}
	public void preferredLanguageDropdownMethod()
	{
		preferredLanguageDropdown.click();
	}
	public void firstnameTextFieldMethod()
	{
		firstnameTextField.sendKeys("Tushar");
	}
	public void middlenameTextFieldMethod()
	{
		middlenameTextField.sendKeys("k");
	}
	public void lastnameTextFieldMethod()
	{
		lastnameTextField.sendKeys("Kanjilal");
	}
	public void maleRadioButtonMethod()
	{
		maleRadioButton.click();
	}
	public void femaleRadioButtonMethod()
	{
		femaleRadioButton.click();
	}
	public void transgenderRadioButtonMethod()
	{
		transgenderRadioButton.click();
	}
	public void dateOfBirthTextFieldMethod()
	{
		dateOfBirthTextField.sendKeys("08/06/1993");
	}
	*/
	
	public void submitForm() throws IOException, InterruptedException
	{
		alertOkButton.click();
		usernameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 0, 1));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		confirmPasswordTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 2, 1));
		securityQuestionDropdown.click();
		securityAnswerTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 3, 1));
		preferredLanguageDropdown.click();
		firstnameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 4, 1));
		middlenameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 5, 1));
		lastnameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 6, 1));
		System.out.println(genderLabel.getText());
		
		  if(genderLabel.getText().equalsIgnoreCase("Gender * :")) 
		  {
			  if(ExcelLibrary.getcellvalue(excel_path, sheet_name, 7, 1).equalsIgnoreCase("male")) 
				  maleRadioButton.click(); 
			  else if(ExcelLibrary.getcellvalue(excel_path, sheet_name, 7, 1).equalsIgnoreCase("female")) 
				  femaleRadioButton.click(); 
			  else if(ExcelLibrary.getcellvalue(excel_path, sheet_name, 7, 1).equalsIgnoreCase("transgender")) 
				  transgenderRadioButton.click(); 
		  }
		 
		Thread.sleep(6000);
		dateOfBirthTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 8, 1));
		
		//occupationDropdown 
		unmarriedRadioButton.click(); 
		//countryDropdown
		emailTextField.sendKeys(); 
		mobileTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 11, 1)); 
		//nationalityDropdown 
		flatDoorBlockNumTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 13, 1));
		stateTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 14, 1)); 
		//cityTownDropdown 
		//postofficeDropdown
		phoneTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 17, 1));
		yesCopyResiToOfficeAddressRadioButton.click();
		notARobotCheckbox.click(); 
		termsAndConditionsCheckbox.click(); 
		registerButton.click();
		
		
	}
}
