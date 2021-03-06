package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage
{
WebDriver ldriver;
public AddCustomerPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
@FindBy(how = How.XPATH, using ="//a[contains(text(),'New Customer')]")
@CacheLookup
WebElement NewCustomer;

@FindBy(how = How.NAME, using = "name")
@CacheLookup
WebElement CustomerName;

@FindBy(how = How.NAME, using  = "rad1")
@CacheLookup
WebElement Gender;

@CacheLookup
@FindBy(how = How.ID_OR_NAME, using = "dob")
WebElement DOB;

@CacheLookup
@FindBy(how = How.NAME, using = "addr")
WebElement Address;

@CacheLookup
@FindBy(how = How.NAME, using = "city")
WebElement City;

@CacheLookup
@FindBy(how = How.NAME, using = "state")
WebElement State;

@CacheLookup
@FindBy(how = How.NAME, using = "pinno")
WebElement PIN;

@CacheLookup
@FindBy(how = How.NAME, using = "telephoneno")
WebElement MobileNumber;

@CacheLookup
@FindBy(how = How.NAME, using = "emailid")
WebElement Email;

@CacheLookup
@FindBy(how = How.NAME, using = "password")
WebElement Password;

@CacheLookup
@FindBy(how = How.NAME, using = "sub")
WebElement Submit;

public void clickAddNewCustomer() {
	NewCustomer.click();
		
}

public void custName(String cname) {
	CustomerName.sendKeys(cname);
	
}

public void custgender(String gender) {
	Gender.click();
}

public void custdob(String mm,String dd,String yy) {
	DOB.sendKeys(mm);
	DOB.sendKeys(dd);
	DOB.sendKeys(yy);
	
}

public void custaddress(String address) {
	Address.sendKeys(address);
}

public void custcity(String city) {
	City.sendKeys(city);
}

public void custstate(String state) {
	State.sendKeys(state);
}

public void custpin(String pin) {
	PIN.sendKeys(String.valueOf(pin));
}

public void custphone(String phone) {
	MobileNumber.sendKeys(phone);
}

public void custemail(String mail) {
	Email.sendKeys(mail);
}

public void custpwd(String password) {
	Password.sendKeys(password);
}

public void custsubmit() {
 Submit.click();
}



}


