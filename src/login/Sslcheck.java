package login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sslcheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(src,new File("C:\\Users\\shing\\Screenshot\\screenshot.png"));
 
	}

}
