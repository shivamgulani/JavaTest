package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadURLEXample {

	public static void main(String args[])
	{
		String driver_location="F:\\development\\jars\\chromedriver.exe";
		String base_url="https://www.google.com";
		
		System.setProperty("webdriver.chrome.driver", driver_location);
		WebDriver driver = new ChromeDriver();
		
		driver.get(base_url);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("Selenium");
		
	}
	
}
