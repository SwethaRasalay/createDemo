package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentimplicitexplicit {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\shing\\eclipse\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("password")).sendKeys("learning");
driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
System.out.println(driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).getText());
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
driver.findElement(By.id("okayBtn")).click();
driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
//driver.switchTo().alert().accept();
//System.out.println(driver.switchTo().alert().getText());
//static dropdown
WebElement Staticdropdown= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
Select dropdown = new Select(Staticdropdown);
dropdown.selectByIndex(2);
System.out.println(dropdown.getFirstSelectedOption().getText());
driver.findElement(By.id("terms")).click();
driver.findElement(By.id("signInBtn")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
driver.manage().window().maximize();
//wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
System.out.println(wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop")));
List <WebElement> Mobiles = driver.findElements(By.cssSelector(".card-footer .btn-info"));
System.out.println(Mobiles.get(0));
for(int i=0;i<Mobiles.size();i++) {
	Mobiles.get(i).click();
	System.out.println(Mobiles.get(i).getText());

}
driver.findElement(By.xpath("(//a[@class='nav-link btn btn-primary'])[1]")).click();
System.out.println(driver.findElement(By.xpath("(//a[@class='nav-link btn btn-primary'])[1]")).getText());

	}

}
