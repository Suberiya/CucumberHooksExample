package com.example.definition;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksExampleDefinition {
	 WebDriver driver;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("Open Website");
        driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		System.out.println("Enter userName");
        driver.findElement(By.name("txtUsername")).sendKeys(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String passWord) {
		System.out.println("Enter passWord");
        driver.findElement(By.name("txtPassword")).sendKeys(passWord);
        driver.findElement(By.id("btnLogin")).submit();
		
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	   
		String newPageText = driver.findElement(By.id("welcome")).getText();
        System.out.println("newPageText:" + newPageText);
        assertThat(newPageText, containsString("Welcome"));
		
	}

	

}
