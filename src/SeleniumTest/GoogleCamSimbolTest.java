package SeleniumTest;

//Generated by Selenium IDE
/*This script was generated as a JUnit from Selenium IDE.
 * */
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class GoogleCamSimbolTest {
	private WebDriver driver;
	JavascriptExecutor js;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
	}
	@After
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void googleCamSimbol() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(895, 692));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".Gdd5U")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".cB9M7")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".cB9M7")).sendKeys("https://www.thespruce.com/thmb/S15sM3N7Zir_xQBGa14Km6gJuCM=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/the-difference-between-trees-and-shrubs-3269804-hero-a4000090f0714f59a8ec6201ad250d90.jpg");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".Qwbd3")).click();
	}
}
