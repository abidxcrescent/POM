package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuotePage extends BasePage{
	
	
	public QuotePage(WebDriver driver) {
		super(driver);
	}
	
//	WebDriver driver;
//	
//	public QuotePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	
	@FindBy(id = "Company-Name")
	WebElement companyName;
	
	
	@FindBy(id = "First-Name")
	WebElement firstName;
	
	@FindBy(id = "Last-Name-3")
	WebElement lastName;
	
	@FindBy(id = "Email-Address")
	WebElement emailAddress;
	
	@FindBy(id = "Phone-Number")
	WebElement phoneNumber;
	
	@FindBy(id = "Contact-Role")
	WebElement contactRole;
	
	@FindBy(id = "How-Did-You-Hear-About-Us")
	WebElement howDidYouHearAboutUs;
	
	@FindBy(id = "Street-Address")
	WebElement streetAddress;
	
	@FindBy(id = "Address-line")
	WebElement addressLine2;
	
	@FindBy(id = "City")
	WebElement city;
	
	@FindBy(id = "State")
	WebElement state;
	
	@FindBy(id = "Zipcode")
	WebElement postalCode;
	
	@FindBy(id = "Country")
	WebElement country;
	
	@FindBy(id = "Retrofit")
	WebElement retrofit;
	
	@FindBy(id = "How-many-trailers-for-retrofit")
	WebElement howManyTrailers;
	
	@FindBy(id = "Primary-OEM-S")
	WebElement newTrailerOEM;
	
	@FindBy(id = "How-many-trailers-on-order")
	WebElement numberOfTrailerOnOrder;
	
	@FindBy(id = "Delivery-Month-Year")
	WebElement anticipatedDeliveryMonthYear;
	
	@FindBy(id = "w-node-_844b457b-5eec-4aa6-010b-8428d6319019-b089700e")
	WebElement submit;
	
	
	public void setCompnayName(String companyName) {
		this.companyName.sendKeys(companyName);
	}
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress.sendKeys(emailAddress);
	}
	
	public void setContactPhone(String contactPhone) {
		this.phoneNumber.sendKeys(contactPhone);
	}
	
	public void setContactRole(String contactRole) {
		this.contactRole.sendKeys(contactRole);
	}
	
	public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
		this.howDidYouHearAboutUs.sendKeys(howDidYouHearAboutUs);
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress.sendKeys(streetAddress);
	}
	
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLine2.sendKeys(addressLineTwo);
	}
	
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	
	public void setState(String state) {
		this.state.sendKeys(state);
	}
	
	public void setZipCode(String zipCode) {
		this.postalCode.sendKeys(zipCode);
	}
	
	public void setCountry(String country) {
		Select countryDropDown = new Select(this.country);
		countryDropDown.selectByVisibleText(country);
	}
	
	public void setRetrofit(String retrofit) {
		Select retrofitDropDown = new Select(this.retrofit);
		retrofitDropDown.selectByVisibleText(retrofit);
	}
	
	public void setNewTrailerOEM(String newTrailerOEM) {
		this.newTrailerOEM.sendKeys(newTrailerOEM);
	}
	
	public void setNumberOfTrailerOrder(String numberOfTrailerOrder) {
		this.numberOfTrailerOnOrder.sendKeys(numberOfTrailerOrder);
	}
	
	public void setAnticipatedDate(String anticipatedDate) {
		this.anticipatedDeliveryMonthYear.sendKeys(anticipatedDate);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
