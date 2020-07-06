
package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) 
	 {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	
	 }

	@FindBy(name="uid")
	@CacheLookup
	WebElement Username;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath = "//*[contains(text(), 'Log out')]")
	@CacheLookup
	WebElement Logout;

	public void setusername(String uname)
	{
		Username.sendKeys(uname);
	}
	 public void setpassword(String pwd)
	 {
		 Password.sendKeys(pwd);
	 }
	 public void clicksubmit()
	 {
		 Login.click();
	 }
    public void clicklogout()
    {
    	Logout.click();
}
	
	
}
