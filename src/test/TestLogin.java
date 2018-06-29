package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLogin {	
	LoginPage loginPage = new LoginPage();
	
	@BeforeTest
	public void setUp() {
		loginPage.setUp();
	}
	
	@Test(priority=1)
	public void testRegistration() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.registration("John", "Doe", "12354", "doe@email.com", "123 street", "city", "Virginia", "22315", "na098", "Nasim8055", "Nasim8055");
	}
	
	@Test(priority=2)
	public void testLogin() {
		loginPage.signOn("na098", "Nasim8055");
	}
	
	@Test(priority=3)
	public void testFlightDetails() {
		loginPage.flightDetails("3", "Frankfurt", "7", "21", "Acapulco", "8", "21");
	}
	
//	@AfterTest
//	public void closeBrowser() {
//		loginPage.closeBrowser();
//	}
}
