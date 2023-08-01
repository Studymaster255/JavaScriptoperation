package BaseLayer;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void initilization(String URL)
	{
	WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver",
//			"F:\\Selenium\\chromedriver_win32 107\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get(URL);
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	}
	
}
