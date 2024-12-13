package com.orm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static WebDriver driver;
	FileInputStream fip;
	public static Properties prop;
	
	public BaseClass() 
	{
		try
		{
			
		String propFilePath="./config.properties";
		
		fip=new FileInputStream(propFilePath);
		prop=new Properties();
		prop.load(fip);
		//System.out.println("base class ");
		}
		catch(FileNotFoundException obj)
		{
			System.out.println(obj.getMessage());
		}
		catch(IOException obj)
		{
			System.out.println(obj.getMessage());
		}
	}
	
	public static void launchBrowser()
	{
		String browser=prop.getProperty("browserToRun");
		switch(browser.toLowerCase().trim())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();


			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("select correct browser");
			
		}
		
	}

}
