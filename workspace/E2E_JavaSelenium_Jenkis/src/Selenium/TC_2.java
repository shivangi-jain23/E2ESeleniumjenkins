package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_2 {
	
	@Test
public void Testcase1(){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("uname");
	
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.quit();
	

	
}

	

}
