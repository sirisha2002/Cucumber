package org.runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {

	WebDriver driver;

	@Given("Go to DemoGuru site and click on Add customer")
	public void go_to_DemoGuru_site_and_click_on_Add_customer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\Desktop\\Jay\\Cucumbertest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	}

	@When("Enter all the informations {string},{string},{string},{string},{string} and click on sumit")
	public void enter_all_the_informations_and_click_on_sumit(String fname, String lname, String email, String add, String phone) {
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(add);
		driver.findElement(By.id("telephoneno")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	
	

	@Then("verify we are able to get the customer ID")
	public void verify_we_are_able_to_get_the_customer_ID() {
		
		String s=driver.getCurrentUrl();
		boolean b=s.contains("uid");
		Assert.assertTrue(b);
		
	  
	}


}
