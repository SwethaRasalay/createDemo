package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://qaclickacademy.com/practice.php");
    driver.findElement(By.id("checkBoxOption2")).click();
    String checkBoxName =  driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
WebElement  Staticdropdown =  driver.findElement(By.id("dropdown-class-example"));
 Select dropdown = new Select(Staticdropdown);
   		dropdown.selectByVisibleText(checkBoxName);
//    WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
//
//    Select s=new Select(dropdown);
//
//    s.selectByVisibleText(checkBoxName);
driver.findElement(By.id("name")).sendKeys(checkBoxName);
driver.findElement(By.id("alertbtn")).click();
String alertMessage= driver.switchTo().alert().getText();
if(alertMessage.contains(checkBoxName)) {
	System.out.println("Success");
}	
else {
	System.out.println("Fail");
}
driver.switchTo().alert().accept();
//driver.switchTo().alert().accept();


	
	
	
	}

}
