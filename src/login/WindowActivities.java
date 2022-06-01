package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class WindowActivities {



public static void main(String[] args) {

// TODO Auto-generated method stub



//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown = new Select(staticdropdown);
//dropdown.getFirstSelectedOption();
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByIndex(1);
System.out.println(dropdown.getFirstSelectedOption().getText());

dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());
//driver.manage().window().maximize();
//
//driver.get("http://google.com");
//
//driver.navigate().to("https://rahulshettyacademy.com");
//
//driver.navigate().back();

driver.navigate().forward();

}



}


