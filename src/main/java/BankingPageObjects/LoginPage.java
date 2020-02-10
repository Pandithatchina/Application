package BankingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
@FindBy(id="email")
WebElement txtEmail;

@FindBy(xpath="//input[@id='pass']")
WebElement txtPass;

@FindBy(xpath="//button[@id='loginbutton']")
WebElement tbnLogin;

public void setUserName(String uName)
{
	txtEmail.sendKeys(uName);
}

public void setPassword(String uPwd)
{
	txtPass.sendKeys(uPwd);
}
public void clickSubmit()
{
	tbnLogin.click();
}
}
