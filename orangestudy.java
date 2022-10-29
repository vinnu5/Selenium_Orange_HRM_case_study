package mm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangestudy {
	WebDriver driver;

	@BeforeTest
	public void BeT() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
}
	@Test()
public void testcase1() throws InterruptedException
{
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@type='submit']")).click();
Thread.sleep(5000);
}
@Test()
public void testcase2() throws InterruptedException {
	
	
	List<WebElement> aa =driver.findElements(By.tagName("a"));
	
    System.out.println(aa.size());
}
@Test()
public void testcase3() throws InterruptedException{
	driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(15).click();
	Thread.sleep(2000);
	driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(15).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
}
}
