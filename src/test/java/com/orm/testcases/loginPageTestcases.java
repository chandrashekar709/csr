package com.orm.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.LoginPageObjects;


public class loginPageTestcases extends BaseClass {
	LoginPageObjects objLoginPageObjects ;
	loginPageTestcases objloginPageTestcases;
	
	public loginPageTestcases()
	{
		super();
	}
	@BeforeMethod
	public  void login() throws IOException, InterruptedException
	{
		objLoginPageObjects=new LoginPageObjects();
		objloginPageTestcases=new loginPageTestcases();
		launchBrowser();
		Thread.sleep(2000);
		objLoginPageObjects.enterUserName(prop.getProperty("username"));
		Thread.sleep(2000);

		objLoginPageObjects.enterPassword(prop.getProperty("password"));
		Thread.sleep(2000);

		objLoginPageObjects.click();
	
	}
	@Test
	public void display()
	{
		System.out.println("hello");
	}



}
