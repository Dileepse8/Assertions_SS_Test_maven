package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void Initialization() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		
	}
	
	public void FailedTestCases(String failedTestCases) {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 //G:\\Education\\Selenium_JAVA\\com.Assertions\\ScreenShots
		try {
			FileUtils.copyFile(srcfile, new File("G:/Education/Selenium_JAVA/com.Assertions/Screenshots/"+failedTestCases+ "_"+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	

}
