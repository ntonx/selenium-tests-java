package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	WebDriver driver;
	// Launch firefox
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "D:/eclipse-workspace/SeleniumExample/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://google.com.mx");
	}
	// Search google bar
	public void search(String value) throws InterruptedException {
		//driver.findElement(By.name("q")).click();
	    
		driver.findElement(By.name("q")).sendKeys(value);
		Thread.sleep(3000);
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	}
	// Close firefox
	public void closeBrowser() {
		driver.close();		
	}
	
	public static void main(String[] args) throws InterruptedException {
		GoogleSearchTest test = new GoogleSearchTest();
		test.openBrowser();
		test.search("cat");
		test.closeBrowser();
	}
}
