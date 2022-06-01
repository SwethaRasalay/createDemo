package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {


	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
//capability.setCapability("chrome.binary",)
//WebDriver driver = new ChromeDriver();
				 
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shing\\eclipse\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
driver.findElement(By.name("inputPassword")).sendKeys("Rhellahul");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@yahoo.com");
driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8919979983");
//driver.findElement(By.cssSelector("p.error"));
//driver.findElements(By.name("")).sendKeyssubmit signInBtn"
//System.out.println();
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
	}

}
