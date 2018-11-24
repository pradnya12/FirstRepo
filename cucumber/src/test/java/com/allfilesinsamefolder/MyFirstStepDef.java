package com.allfilesinsamefolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	
	@Given("^open facebook page$")
	public void openFacebookPage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\selenium\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
				driver.get("https://www.facebook.com");
	}
	
	
	@When("^I enter Login name$")
	public void i_enter_Login_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//input[@type='email']
		//input[@type='password']
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\selenium\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
				driver.get("https://www.facebook.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pradnya12shine");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test123");
				
	   
	}

	@Then("^i verify textbox value$")
	public void i_verify_textbox_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalSoftware\\selenium\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		boolean button=driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed();
		if (button == true)
		{
		Assert.assertTrue(button);
		}
		
	}

}
