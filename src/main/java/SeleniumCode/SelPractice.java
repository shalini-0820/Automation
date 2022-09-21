package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SelPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// System.setProperty("webdrver.gecko.driver","C:\\Users\\Pradeep\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");

		// WebDriver driver=new FirefoxDriver();

		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");

		driver.findElement(By.id("email")).sendKeys("john");
		driver.findElement(By.id("password")).sendKeys("xyz");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div.bodySmall")).getText(),
				"Your email or password is incorrect.");
		driver.findElement(By.linkText("Forgot Password")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// driver.findElement(By.cssSelector("input[type='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("commit")).click();

		// driver.findElement(By.cssSelector("button[class*='button']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'button')]")).click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// driver.close();

	}

}
