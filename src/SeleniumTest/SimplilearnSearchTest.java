package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// this class is to visualize how class tags are selected to execute selenium testing
public class SimplilearnSearchTest {
	WebDriver driver;
	public void LaunchBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/eclipse-workspace/SeleniumExample/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://simplilearn.com");
		Thread.sleep(1500);
	}
	
	public void search() throws InterruptedException {
		
		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
		Thread.sleep(1500);
		/*The next two lines did not find the span element in website. To search the correct element, use the search 
		 * console (magnifying glass symbol) that is located below the 'INSPECTOR' window once you 'Inspect webpage' 
		 * (Rigth click on a website).*/
		//driver.findElement(By.xpath("//span[@class='search_icon']")).click();
		//driver.findElement(By.xpath("//span.search_icon.input-search-icon")).click();
		driver.findElement(By.xpath("//button[@class='input-search-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training']")).click();
		System.out.println("The page title is: " + driver.getTitle());
		Thread.sleep(3000);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		SimplilearnSearchTest objSearchTest = new SimplilearnSearchTest();
		objSearchTest.LaunchBrowser();
		objSearchTest.search();
		objSearchTest.closeBrowser();
		
	}
}

