package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Code\\Jar Files\\browserDrivers\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("http://newtours.demoaut.com/");
	}

	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement registerBtn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	WebElement firstName;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
	WebElement lastName;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
	WebElement phoneNum;
	@FindBy(xpath="//*[@id='userName']")
	WebElement email;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
	WebElement address;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
	WebElement city;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")
	WebElement state;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")
	WebElement postalCode;
	@FindBy(xpath="//*[@id='email']")
	WebElement username;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	WebElement password;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
	WebElement confirmPassword;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
	WebElement submitBtn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")
	WebElement signOnBtn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
	WebElement usernameSignOn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	WebElement passwordSignOn;
	
	public void registration(String strFN, String strLN, String strPhone, String strEmail, String strAddress, String strCity, String strState, String strPostalCode,
			String strUsername, String strPassword, String strConfirmPassword) {
		registerBtn.click();
		firstName.sendKeys(strFN);
		lastName.sendKeys(strLN);
		phoneNum.sendKeys(strPhone);
		email.sendKeys(strEmail);
		address.sendKeys(strAddress);
		city.sendKeys(strCity);
		state.sendKeys(strState);
		postalCode.sendKeys(strPostalCode);
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		confirmPassword.sendKeys(strConfirmPassword);
		submitBtn.click();
	}
	
	public void signOn(String strUsername, String strPassword) {
		signOnBtn.click();
		usernameSignOn.sendKeys(strUsername);
		passwordSignOn.sendKeys(strPassword);
	}

	public void closeBrowser() {
		driver.close();
	}
}



