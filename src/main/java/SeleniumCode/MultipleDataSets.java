package SeleniumCode;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDataSets {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Tomato"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(2000);
		
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<products.size();i++)
		{
			
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		
		//format it to get the actual name
		
		//convert array into array list 
		//checking if the name extracted is present in the arrayList or not
		
		List itemsNeededList=Arrays.asList(itemsNeeded);
		int j=0;
		if(itemsNeededList.contains(formattedName)) 
			
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==itemsNeeded.length) {
				break;	
		}
		
		
		}}
		}}
	


