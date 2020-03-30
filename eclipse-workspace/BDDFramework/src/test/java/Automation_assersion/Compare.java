package Automation_assersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {
	
	public boolean validateURL(WebDriver driver, String ExpectedURL)
	{
		boolean result= false;
		if (driver.getCurrentUrl().equalsIgnoreCase("ExpetedURL"));
		{
			result= true;
		}
		return result;
	}
  public boolean validateelementbyxpath(WebDriver driver, String xpath)
{
	  boolean result= false;
	 try
	 { 
	  driver.findElement(By.xpath("xpath"));
	  result = true;
	
	 }
	  catch(Exception e)
	  {}
	 return result; 
} 
}