package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\shing\\eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.findElement(By.name("name")).sendKeys("Swetha");
driver.findElement(By.name("email")).sendKeys("rasalay.shwetha@gmail.com");
driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nagarathna@123");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
Select gender = new Select(dropdown);
gender.selectByVisibleText("Female");
driver.findElement(By.id("inlineRadio2")).click();
System.out.println(driver.findElement(By.id("inlineRadio2")).isSelected());
driver.findElement(By.name("bday")).sendKeys("06/07/1993");
driver.findElement(By.cssSelector(".btn")).click();
System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
	}

}
