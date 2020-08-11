package screenShots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Reusability;

public class ScreenShotDemo {
	WebDriver driver;

	@Test
	public void Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//span[contains(.,'Sign in')])[2]")).click();
	}

	@AfterMethod
	public void tearDown(ITestResult result) 
	{
		if (ITestResult.FAILURE == result.getStatus()) 
		{
			Reusability.capturedScreenShot(driver, result.getName());
		}
		driver.quit();
	}
}
