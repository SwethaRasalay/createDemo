package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).clear();

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
