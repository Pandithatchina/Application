package Banking.Application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Praticse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Pandi pc//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		try
		{
			Select drop=new Select(driver.findElement(By.xpath("//select[@id='speed']")));
			List<WebElement>options=drop.getOptions();
			int dropSize=options.size();
			for(int i=0;i<dropSize;i++)
			{
				String dropValue=drop.getOptions().get(i).getText();
				if(dropValue.equals("Fast"))
				{
					drop.deselectByIndex(i);
					WebElement txtFirst=driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']"));
					txtFirst.sendKeys("7");
					String temp=txtFirst.getAttribute("value");
					System.out.println("Entered value is " +temp);
					
				}
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		driver.quit();

	}

}
