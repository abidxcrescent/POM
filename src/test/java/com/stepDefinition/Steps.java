package com.stepDefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.QuotePage;
import pageObjects.Requestademo;

public class Steps {
	
	WebDriver driver;
	Logger log;
	HomePage homePage;
	QuotePage quotePage;
	Requestademo requestpage;
	
	@Before
	public void openChromeWindow() {
		
		log = LogManager.getLogger(this.getClass());
		
		

	}
	
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",scenario.getName());
            }
//       driver.quit();
    }
	
	
	
	
	@Given("I want to open chrome")
	public void openChrome() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@Given("Navigate to Drov")
	public void navigateToDrov() {
		driver.navigate().to("https://www.drovtechnologies.com/");
		driver.manage().window().maximize();
	
	}

	@Then("I want to click on get a quote")
	public void i_want_to_click_on_get_a_quote() {
		homePage = new HomePage(driver);
		homePage.clickOnGetAQuote();
	}
	
	@Given("I click on request a demo")
	public void i_click_on_request_a_demo() {
		homePage = new HomePage(driver);
		homePage.clickOnRequestAdemo();
	}
	@Then("I click on system of intrest {string}")
	public void i_click_on_system_of_intrest(String products) {
		requestpage = new Requestademo(driver);
		requestpage.setProducts(products);
		
	}
	
	@Then("I want to set company name as {string}")
	public void i_want_to_set_company_name_as(String companyName) {
		quotePage = new QuotePage(driver);
		quotePage.setCompnayName(companyName);
	}
	
	
	@Then("I want to set first name as {string}")
	public void i_want_to_set_first_name_as(String firstName) {
		quotePage.setFirstName(firstName);
	}

	@Then("I want to set last name as {string}")
	public void i_want_to_set_last_name_as(String lastName) {
		quotePage.setLastName(lastName);
	}

	@Then("I want to set email address as {string}")
	public void i_want_to_set_email_address_as(String emailAddress) {
		quotePage.setEmailAddress(emailAddress);
	}

	@Then("I want to set contact number as {string}")
	public void i_want_to_set_contact_number_as(String contactNumber) {
		quotePage.setContactPhone(contactNumber);
	}

	@Then("I want to set contact role as {string}")
	public void i_want_to_set_contact_role_as(String contactRole) {
		quotePage.setContactRole(contactRole);
	}

	@Then("I want to set how did you hear about us as {string}")
	public void i_want_to_set_how_did_you_hear_about_us_as(String howDidYouHearAvoutUs) {
		quotePage.setHowDidYouHearAboutUs(howDidYouHearAvoutUs);
	}

	@Then("I want to select street address as {string}")
	public void i_want_to_select_street_address_as(String streetAddress) {
		quotePage.setStreetAddress(streetAddress);
	}

	@Then("I want to select address line two as {string}")
	public void i_want_to_select_address_line_two_as(String steetAddressLineTwo) {
		quotePage.setAddressLineTwo(steetAddressLineTwo);
	}

	@Then("I want to select city as {string}")
	public void i_want_to_select_city_as(String city) {
		quotePage.setCity(city);
	}

	@Then("I want to select state as {string}")
	public void i_want_to_select_state_as(String state) {
		quotePage.setState(state);
	}

	@Then("I want to select zip as {string}")
	public void i_want_to_select_zip_as(String zipCode) {
		quotePage.setZipCode(zipCode);
	}

	@Then("I want to select country as {string}")
	public void i_want_to_select_country_as(String country) {
		quotePage.setCountry(country);
	}

	@Then("I want to select retrofit as {string}")
	public void i_want_to_select_retrofit_as(String retrofit) {
		quotePage.setRetrofit(retrofit);
	}

	@Then("I want to select new trailer oems as {string}")
	public void i_want_to_select_new_trailer_oems_as(String newTrailerOEM) {
		quotePage.setNewTrailerOEM(newTrailerOEM);
	}

	@Then("I want to select number of trailers as {string}")
	public void i_want_to_select_number_of_trailers_as(String numberOfTrailers) {
		quotePage.setNumberOfTrailerOrder(numberOfTrailers);
	}

	@Then("I want to select aniticipated delivery as {string}")
	public void i_want_to_select_aniticipated_delivery_as(String anticipatedDeliveryDate) {
		quotePage.setAnticipatedDate(anticipatedDeliveryDate);
	}
	
	@Then("I click on submit")
	public void i_click_on_submit() {
		quotePage.clickSubmit();
	}
	
	@Then("I verify the message with {string}")
	public void i_verify_the_message_with(String string) {
		Assert.assertEquals(string,"Thank You!");
	}
	
	
	@Then("d I want to set company name as {string}")
	public void d_i_want_to_set_company_name_as(String companyName) {
		requestpage.setCompnayName(companyName);
	}

	@Then("d I want to set first name as {string}")
	public void d_i_want_to_set_first_name_as(String firstName) {
		requestpage.setFirstName(firstName);
	}

	@Then("d I want to set last name as {string}")
	public void d_i_want_to_set_last_name_as(String lastName) {
		requestpage.setFirstName(lastName);
	}

	@Then("d I want to set email address as {string}")
	public void d_i_want_to_set_email_address_as(String emailAddress) {
		requestpage.setEmailAddress(emailAddress);
		
	}

	@Then("d I want to set contact number as {string}")
	public void d_i_want_to_set_contact_number_as(String contactNumber) {
		requestpage.setContactPhone(contactNumber);
	}

	@Then("d I want to set contact role as {string}")
	public void d_i_want_to_set_contact_role_as(String contactRole) {
		requestpage.setContactRole(contactRole);
	}

	@Then("d I want to set how did you hear about us as {string}")
	public void d_i_want_to_set_how_did_you_hear_about_us_as(String howDidYouHearAvoutUs) {
		requestpage.setHowDidYouHearAboutUs(howDidYouHearAvoutUs);
	}

	@Then("d I want to select street address as {string}")
	public void d_i_want_to_select_street_address_as(String streetAddress) {
		requestpage.setStreetAddress(streetAddress);
	}

	@Then("d I want to select address line two as {string}")
	public void d_i_want_to_select_address_line_two_as(String steetAddressLineTwo) {
		requestpage.setAddressLineTwo(steetAddressLineTwo);
	}

	@Then("d I want to select city as {string}")
	public void d_i_want_to_select_city_as(String city) {
			requestpage.setCity(city);
	}

	@Then("d I want to select state as {string}")
	public void d_i_want_to_select_state_as(String state) {
		requestpage.setState(state);
	}

	@Then("d I want to select zip as {string}")
	public void d_i_want_to_select_zip_as(String zipCode) {
		requestpage.setZipCode(zipCode);
	}

	@Then("d I want to select country as {string}")
	public void d_i_want_to_select_country_as(String country) {
		requestpage.setCountry(country);

	}
	@Then("d I click on submit")
	public void d_i_click_on_submit() {
		requestpage.clickSubmit();
	}



	
	

}
