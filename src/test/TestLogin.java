package test;

import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLogin {	
	LoginPage loginPage = new LoginPage();
	
	@Test
	public void testLogin() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.setUp();
		loginPage.login("admin@phptravels.com", "demoadmin");
	}
	
	@Test
	public void testSummaryTitle() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.validateBookinSummaryTitle("BOOKING SUMMARY");
	}
	

}
