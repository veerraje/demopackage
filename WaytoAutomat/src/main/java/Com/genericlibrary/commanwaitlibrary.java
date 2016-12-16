package Com.genericlibrary;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commanwaitlibrary {
	public static WebDriver driver;

	public commanwaitlibrary(WebDriver driver) {
		commanwaitlibrary.driver = driver;
	}


	public static WebDriverWait wait= new WebDriverWait(driver, 50);;
	
	
	public static void waitForElementToBeClickable(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	    
	public static void waitForElementToBeVisible(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForElementToBeSelected(WebElement element){
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public static void waitForAlert(){
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitForSwitchingOnFrame(WebElement element){
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	
	public static void waitForTitle(String title){
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	 public static void waitForpageLoad(WebDriver driver) {
	        ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	                };
	
	
	/*
	public void waitforpagetoload() {
		BrowserFactoryy.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void waitforxpathpresent(String wbxpath) {
		WebDriverWait wait1 = new WebDriverWait(BrowserFactoryy.driver, 10);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbxpath)));
		// note expected condition class he,
	}

	public void waitfornamepresent(String wbname) {
		WebDriverWait wait2 = new WebDriverWait(BrowserFactoryy.driver, 10);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.name(wbname)));
	}

	public void waitforidpresent(String wbid) {
		WebDriverWait wait3 = new WebDriverWait(BrowserFactoryy.driver, 10);
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.id(wbid)));
	}*/

	
	
}
}