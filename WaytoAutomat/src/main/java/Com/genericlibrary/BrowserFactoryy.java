package Com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactoryy {
	public static WebDriver driver;

	public static WebDriver getbrowser() {
		if (Constantss.Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\ECLIPSEWORKSPACE\\WaytoAutomat\\src\\main\\resources\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (Constantss.Browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\ECLIPSEWORKSPACE\\WaytoAutomat\\src\\main\\resources\\BrowserDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		else if (Constantss.Browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		else if (Constantss.Browser.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\ECLIPSEWORKSPACE\\WaytoAutomat\\src\\main\\resources\\BrowserDriver\\operadriver.exe");
		} else {

			driver = new FirefoxDriver();
		}
		return driver;
		
	}
}
