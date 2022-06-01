package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptexecutorforScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shing\\eclipse\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(3000);
js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=500");

int sum =0;
	List<WebElement>Amountlist = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	for(int i=0;i<Amountlist.size();i++) {
		
		sum = sum+Integer.parseInt(Amountlist.get(i).getText());
	}
	System.out.println(sum);
	int total  = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
Assert.assertEquals(sum, total);
	
	}

}
