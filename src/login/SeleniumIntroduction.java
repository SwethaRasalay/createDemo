package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(num);
		int[] id = { 1, 2, 2, 2, 3, 4, 4, 5, 6 };
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		String[] name = { "vinay", "Rahul", "Naina" };
		for (String s : name) {
			System.out.println(s);

		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		String[] fam = { "Vinay", "Swetha", "Punnu" };
		for (int i = 0; i < fam.length; i++) {
			System.out.println(fam[i]);
		}
		for (String s : fam) {
			System.out.println(s);
		}
//Chrome driver
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\shing\\eclipse\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// driver.close();
		// Firefox driver
		
//		 System.setProperty("webdriver.gecko.driver",
//		  "C:\\Users\\shing\\eclipse\\geckodriver.exe"); WebDriver driver = new
//		  FirefoxDriver();
//		 
		 
//			 System.setProperty("webdriver.edge.driver",
//			 "C:\\Users\\shing\\eclipse\\msedgedriver.exe"); WebDriver driver = new
//			 * EdgeDriver(); driver.get("https://mvnrepository.com");
//			 * System.out.println(driver.getCurrentUrl());
//			 * System.out.println(driver.getTitle()); driver.close();
//			 */
	}

}
