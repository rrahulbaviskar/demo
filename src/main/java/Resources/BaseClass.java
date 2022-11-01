package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver browserlunch() throws IOException {
		
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		 prop=new Properties();
		
		prop.load(fis);
		
		
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
			
			
		}
		
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			
		}
		
		else {
			System.out.println("Browser not Valid");
			
		}
		
		return driver;
		
		
	}

	@BeforeMethod
	public  void openbrowser() throws IOException {
		
		browserlunch();
		driver.get(prop.getProperty("url"));
		
	}
	
}
