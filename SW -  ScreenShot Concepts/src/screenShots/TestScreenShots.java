package screenShots;

//import java.io.File;
//import org.apache.commons.io.FileUtils;  // Import Jar file from MVNRepository and To Project
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Reusability;

public class TestScreenShots {
	@Test
	public void Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		
		Reusability.capturedScreenShot(driver, "A. Launch Application");
		
		driver.findElement(By.xpath("(//span[contains(.,'Sign in')])[2]")).click();
		
		Reusability.capturedScreenShot(driver, "B. Click Sign In Button");
        
		driver.quit();
	}
}







/*		TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./ScreenShots/EasyCalculation.png"));
System.out.println("Captured ScreenShot");*/