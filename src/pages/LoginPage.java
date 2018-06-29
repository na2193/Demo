package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")
	WebElement homeBtn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement usernameSignOn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement passwordSignOn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement signOnBtn;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayRB;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")
	WebElement passengers;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")
	WebElement departingFrom;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")
	WebElement onMonth;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]")
	WebElement onDay;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select")
	WebElement arrivingIn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]")
	WebElement returningMonth;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]")
	WebElement returningDay;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement serviceClass;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")
	WebElement continueBtn;
	
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
		homeBtn.click();
		usernameSignOn.sendKeys(strUsername);
		passwordSignOn.sendKeys(strPassword);
		signOnBtn.click();
	}

	public void closeBrowser() {
		driver.close();
	}
	
	public void flightDetails(String passengersUser, String departingFromUser, String onMonthUser, String onDayUser, String arrivingInUser, 
			String returningMonthUser, String returningDayUser) {
		oneWayRB.click();
		selectFromDropDownList(passengers, passengersUser);
		selectFromDropDownList(departingFrom, departingFromUser); 
		selectFromDropDownList(onMonth, onMonthUser); // value is in number 1 for january, etc
		selectFromDropDownList(onDay, onDayUser);
		selectFromDropDownList(arrivingIn, arrivingInUser);
		selectFromDropDownList(returningMonth, returningMonthUser);
		selectFromDropDownList(returningDay, returningDayUser);
		serviceClass.click(); // first class
		continueBtn.click();
	}
	
	public void selectFromDropDownList(WebElement locator, String valueName) {
		Select dropDown = new Select(locator);
		dropDown.selectByValue(valueName);
	}
}



