package login;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching Window
driver.switchTo().newWindow(WindowType.TAB);
 Set<String> handles = driver.getWindowHandles();
   Iterator<String> it = handles.iterator();
 String Parentid = it.next();
 String Childid = it.next();
 driver.switchTo().window(Childid);
 driver.get("https://rahulshettyacademy.com/");
 String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
driver.switchTo().window(Parentid);
WebElement name = driver.findElement(By.name("name"));
name.sendKeys(courseName);

//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\Users\\shing\\Screenshot\\name.png"));
//driver.quit();
//FileUtils.copyFile(src, newFile("C:\\Users\\shing\\Screenshot\\screenshot.png"));
System.out.println(name.getRect().getDimension().getHeight());
System.out.println(name.getRect().getDimension().getWidth());



	
	}

}
