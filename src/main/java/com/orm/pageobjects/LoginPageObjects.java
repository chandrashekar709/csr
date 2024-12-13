package com.orm.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;

public class LoginPageObjects extends BaseClass 

{

	private By username1 = By.name("username");

	private By password1=By.id("password");
	private By click=By.id("Login");
	
	public void enterUserName(String uname)
	{
		driver.findElement(username1).sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password1).sendKeys(pwd);
	}
	public void click()
	{
		driver.findElement(click).click();
	}
	

}


	
	


