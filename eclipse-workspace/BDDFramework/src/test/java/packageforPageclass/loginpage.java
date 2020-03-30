package packageforPageclass;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	ResourceBundle element;
	
	public loginpage(WebDriver driver)
	{
		this.driver= driver;
	element= ResourceBundle.getBundle("Elementlocator");	 
	}
	
	
	public void LoginUserID(String uname)
	{
		driver.findElement(By.id(element.getString("Username_login_id"))).sendKeys(uname);
	}
	
	public void Loginpassword(String pass)
	
	{
		driver.findElement(By.id(element.getString("Username_login_pass"))).sendKeys(pass);
		
	}
	public void Submitbutton()
	{
		driver.findElement(By.xpath(element.getString("Username_loginbutton_xpath"))).click();
	}
	public void forgotpassword()
	{
		driver.findElement(By.xpath(element.getString("forgetpassword_xpath"))).click();
	}
}
