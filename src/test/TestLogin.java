package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLogin {	
	LoginPage loginPage = new LoginPage();
	
	@Test
	public void testRegistration() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.setUp();
		loginPage.registration("John", "Doe", "12354", "doe@email.com", "123 street", "city", "Virginia", "22315", "na123", "Nasim8055", "Nasim8055");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		loginPage.closeBrowser();
	}


}
