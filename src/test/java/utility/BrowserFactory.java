package utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver browserOptions(WebDriver driver, String browserName, String AppUrl) {
	      
        if (browserName.equalsIgnoreCase("Chrome")) {
            // Adjust path as needed; remove trailing spaces
            System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "./BrowserDrivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
           System.out.println("Sorry, this browser is not supported: " + browserName);
        }
        
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(AppUrl);
     
        return driver;
    }
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	
		
	}



