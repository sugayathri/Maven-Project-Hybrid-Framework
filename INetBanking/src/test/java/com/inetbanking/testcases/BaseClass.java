package com.inetbanking.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	ReadConfig config=new ReadConfig();
	public String baseURl=config.getApplicationURL();
	public String username=config.getUSername();
	public String password=config.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		 logger=Logger.getLogger("ebanking");
			PropertyConfigurator.configure("Log4j.properties");
			if(br.equals("chrome"))
			{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
			}
			else if(br.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(br.equals("edge"))
			{

				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			 else if(br.equals("explorer"))
			{

				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
			}
			driver.get(baseURl);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.xpath("//a[@href='#']/following::a")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	
	}
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	public String randomNum()
	{
		String generatedstringNum=RandomStringUtils.randomNumeric(4);
		return(generatedstringNum);
	}
}
