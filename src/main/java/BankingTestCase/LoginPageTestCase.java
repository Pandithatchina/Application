package BankingTestCase;

import org.testng.annotations.Test;

import BankingPageObjects.LoginPage;

public class LoginPageTestCase extends BaseClass{
	@Test
	public void loginTest()
	{
		LoginPage lpobj=new LoginPage(driver);
		log.info("Entering the username");
		lpobj.setUserName(userName);
		log.info("Entering Password");
		lpobj.setPassword(passWord);
		log.info("Clicking log in button");
		lpobj.clickSubmit();
	}
	
	
}
