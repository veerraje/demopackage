package ObjRepo.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;

	public Login(WebDriver driver) {
		Login.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text()='Signin']")

	private WebElement singhinlink;

	@FindBy(how = How.XPATH, using = "(//input[@name='username'])[2]")

	private WebElement usernambox;

	@FindBy(how = How.XPATH, using = "(//input[contains(@name,'password')])[2]")

	private WebElement passwrdbox;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'button')])[2]")

	private WebElement submitt;

	public void loginmethod(String usernam, String passwrd) {
		
		singhinlink.click();
		usernambox.sendKeys(usernam);
		passwrdbox.sendKeys(passwrd);
		submitt.click();
	}

}
