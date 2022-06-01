package login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdownassignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
driver.findElement(By.id("autocomplete")).sendKeys("can");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
List<WebElement> DDL = driver.findElements(By.cssSelector("#ui-id-1 li div"));

for(WebElement list : DDL)

{

if(list.getText().equalsIgnoreCase("CANADA")) {

System.out.println(list.getText());

list.click();

break;
}
}
//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 




	}

}
