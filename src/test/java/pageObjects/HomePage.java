package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
//	WebDriver driver;
//	
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//*[@id=\"w-node-_5323a3a0-38e0-aa23-abb7-2d89d707eefa-e9896fb7\"]/div/a[1]/div")
	WebElement getAQoute;
	
	@FindBy(xpath = "//*[@id=\"w-node-_5323a3a0-38e0-aa23-abb7-2d89d707eefa-e9896fb7\"]/div/a[2]/div")
	WebElement requestAdemo;
	
	
	public void clickOnGetAQuote() {
		this.getAQoute.click();
	}
	
	public void clickOnRequestAdemo() {
		this.requestAdemo.click();
	}

}
