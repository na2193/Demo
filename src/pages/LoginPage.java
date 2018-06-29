package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Code\\Jar Files\\browserDrivers\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://www.phptravels.net/admin");
	}

	@FindBy(xpath="/html/body/div/form[1]/div[1]/input[1]")
	WebElement email;

	@FindBy(xpath="/html/body/div/form[1]/div[1]/input[2]")
	WebElement password;

	@FindBy(xpath="/html/body/div/form[1]/button")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]")
	WebElement summaryTitle;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div[2]/form/button")
	WebElement bookingsBtn;

	public void login(String strEmail, String strPassword) {
		email.sendKeys(strEmail);
		password.sendKeys(strPassword);
		loginBtn.click();
	}
	
	public void validateBookinSummaryTitle(String expectedText) {
		String actualText = summaryTitle.getText();
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void clickBookings() {
		bookingsBtn.click();
	}
}



