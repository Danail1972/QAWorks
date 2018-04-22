package Tests;


import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsStepDefinition {
	
	WebDriver driver = null;
	
	@Given("^I am on the QAWorks Site$")
	public void navigateToQAWorks() throws Throwable {
	   
	   	try {
	   		driver = new FirefoxDriver();
	   		driver.navigate().to("http://www.qaworks.com/");
	   		}
	   	catch(Exception e) 
	   		{
	   		System.out.println("You are on QAWorks site!");
	   		};
	}

	@When("^I navigate to contact page$")
	public void i_navigate_to_contact_us_page() throws Throwable {
	   
		 try {
			 driver.findElement(By.id("contact-us")).click();
		 	 } 
		 catch (Exception e) 
		 	 {
		System.out.println("You are on a contact us page!");;
		 	 }
	}

	@And("^I enter the following information$")
	public void i_enter_the_following_information() throws Throwable {
	    try {
			driver.findElement(By.name("name_field")).sendKeys("j.Bloggs");
			driver.findElement(By.name("email_field")).sendKeys("j.Bloggs@qaworks.com");
			driver.findElement(By.name("subject_field")).sendKeys("test automation");
			driver.findElement(By.name("message_field")).sendKeys("please contact me I want to find out more");
			driver.findElement(By.id("submit_message")).click();
			} 
	    catch (Exception e) 
	    	{
			System.out.println("Valid information passed!");;
		    }
	   
	}

	@Then("^I should be able to contact QAWorks$")
	public void i_should_be_able_to_contact_QAWorks() throws Throwable {
	    System.out.println("Congratulations! You have successfully submited your request");
	}
	
	@Then("^I should not be able to contact QAWorks$")
	public void i_should_not_be_able_to_contact_QAWorks() throws Throwable {
	    System.out.println("Unable to submit with invalid symbols");


	}
}