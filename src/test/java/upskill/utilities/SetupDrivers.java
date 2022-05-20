package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static WebDriver driver;                                //Initializing the driver.
	
	public static void SetupDriver() {
//      System.setProperty("webdriver.chrome.driver", "C:\\UpSkill Software\\BrowserDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();                  //Getting driver.
		ChromeOptions options = new ChromeOptions();              //Initializing driver options.
		options.addArguments("--start-maximized");                //Adding arguments.
		options.addArguments("--disable-notifications");          //Adding arguments.
//      options.addArguments("--headless");                       //Adding arguments.
		driver = new ChromeDriver(options);                       //Declaring driver value.
	    driver.get("https://www.ebay.com/");                      //Loading the web page.
					
		}
		
	public static WebDriver getDriver() {                         //Returning driver to call.
		return driver;
	}
	public static void tearDownDriver() { 
//		driver.close();                                           //Closing current driver session.
        driver.quit();                                            //Closing all driver session.
		
		
	}
}
