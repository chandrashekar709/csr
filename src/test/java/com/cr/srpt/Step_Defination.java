package com.cr.srpt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Defination {
	WebDriver driver;
	By username=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password'] ");
	By click=By.xpath(" //input[@type='submit']");
	String url="https://login.salesforce.com/ ";
	
	@Given("launch the application with expected browser")
	public void launch_the_application_with_expected_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		@When("Enter valid username and valid password")
	public void enter_valid_username_and_valid_password() 
	{
		driver.findElement(username).sendKeys("cs@gmail.com");
		driver.findElement(password).sendKeys("abd@123");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() 
	{
		driver.findElement(click).click();
			
	}
}