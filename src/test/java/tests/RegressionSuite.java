package tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import Components.Health;
import Components.LoginComponent;
import Components.Myaccount;



public class RegressionSuite {

	public Health health;
	public LoginComponent logincomponent;
	public Myaccount myaccount;
	Logger log = Logger.getLogger(RegressionSuite.class);

	@BeforeClass(alwaysRun = true, groups = "regression")
	public void init() throws IOException {
		health = new Health();
		logincomponent = new LoginComponent();
		myaccount = new Myaccount();
		
		
	}

	@Test(alwaysRun = true, groups = "regression", description = "this test will verify the login function", priority = 0)
	public void test_openBrowser() {
		logincomponent.accessURL();
		log.info("");
		
	}

	@Test(alwaysRun = true, groups = "regression", description = "this test will verify the MyAccout function", priority = 1)
	public void test_myAccount()

	{
		myaccount.verifyMyAccount();
	}

	@Test(alwaysRun = true, groups = "regression", description = "this test will verify the health page", priority = 2)
	public void test_health() {

		health.verifyHeaderlinks();

	}
}
