package BankingTestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseUrl="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110";
	public String userName="test123@gmail.com";
	public String passWord="test123";
	public static WebDriver driver;
	public static Logger log;
@AfterClass
public void tearDown()
{
	driver.quit();
	log.info("Closing the browser");
}
@BeforeClass
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", "C://Users//Pandi pc//Drivers//chromedriver.exe");
	driver=new ChromeDriver();
	log=Logger.getLogger(BaseClass.class.getName());
	PropertyConfigurator.configure("log4j.properties");
	log.info("launching the chrome");
	driver.manage().window().maximize();
	driver.get(baseUrl);
}




}
