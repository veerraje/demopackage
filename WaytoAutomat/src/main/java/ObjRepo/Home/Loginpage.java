/**
 * 
 */
package ObjRepo.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Veer
 *
 */
public class Loginpage {
	WebDriver driver;
    By signlink = By.xpath("//a[text()='Signin']");
	By username = By.xpath("(//input[@name='username'])[2]");
	By password = By.xpath("(//input[contains(@name,'password')])[2]");
	By submit = By.xpath("(//input[contains(@class,'button')])[2]");

	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logintest(String userid, String pass){
	    
		driver.findElement(signlink).click();
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit).click();
		
	}
	
}


