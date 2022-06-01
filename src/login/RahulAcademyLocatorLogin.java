package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class RahulAcademyLocatorLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//String name ="rahul";

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.xpath("//input[@id=\"inputUsername\"]")).sendKeys("rahul");
driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("button[type='submit']")).click();
Thread.sleep(2000);
//System.out.println(driver.findElement(By.className("")).getText());
System.out.println(driver.findElement(By.tagName("p")).getText());
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+ ",");
	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	driver.close();
	}

}
