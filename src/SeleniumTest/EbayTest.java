package SeleniumTest;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;



public class EbayTest {
	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "D:/eclipse-workspace/SeleniumExample/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		//Dimension newDimension = new Dimension(600,400);
		//driver.manage().window().setSize(newDimension);
		
		driver.manage().window().maximize();
		
		driver.get("https://ebay.com");
	}
	
	public void searchProduct() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	    driver.findElement(By.id("gh-btn")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("ebay Ofertas")).click();
	}
	
	public void navigate() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://lms.simplilearn.com");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("titlepage: " + driver.getTitle());
	}
	
	public void mouseMove() throws InterruptedException {
		driver.navigate().to("https://ebay.com");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//a[@_sp='p2481888.m1379.l3250']"));
		WebElement element2 = driver.findElement(By.xpath("//a[@_sp='p2481888.m1379.l3259']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(element1).perform();
		Thread.sleep(2000);
		element2.click();
		Thread.sleep(2000);
	}
	
	public void takeScreen() throws InterruptedException, IOException {
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testtest");		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(2000);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File pathdesFile = new File("D:/eclipse-workspace/SeleniumExample/screens/login.png");
		Files.copy(source, pathdesFile);
	}
	
	public void dropDownButton() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement  month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select setday = new Select(day);
		Select setmonth = new Select(month);
		Select setyear = new Select(year);
		
		setday.selectByValue("25");
		setmonth.selectByIndex(5);
		setyear.selectByVisibleText("2000");
		
		System.out.println("Day selected: " + setday.getFirstSelectedOption().getText());
	}
	
	public void verifyInternalLinksAvailability() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i=0; i<links.size();i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL (HREF) IS NOT CONFIGURED");
				continue;
			}
			try {
				HttpURLConnection header = (HttpURLConnection)(new URL(url)).openConnection(); 
				header.setRequestMethod("HEAD");
				header.connect();
				int response = header.getResponseCode();
				if(response >= 400) {
					System.err.println("URL: "+ url+ " is broken");
				}
				else {
					System.out.println("URL: "+ url+ " is valid");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		EbayTest obj = new EbayTest();
		obj.openBrowser();
		
		
		
		
		// TEST 1
		/*
		obj.searchProduct();
		obj.navigate();
		obj.closeBrowser();
		*/
		
		
		
		
		/* TEST 2
		 * Description: This is other complete test that evaluate movement on list expandable (menu list that is compressed)*/
		/*
		obj.mouseMove();
		obj.closeBrowser();
		*/
		
		
		
		
		/* TEST 3
		 * Description: This test is for taking screenshot during test execution
		 */
		/*
		try {
			obj.takeScreen();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		/* TEST 4
		 * Description: This is to test select action class in dropdown button
		 * */
		
		//obj.dropDownButton();
		
		
		
		
		/* TEST 5
		 * Description: This test evaluate all links availability in a webpage
		 * */
		obj.verifyInternalLinksAvailability();
	}
}
