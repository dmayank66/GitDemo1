package Academy.E2Eproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
public WebDriver initlizeDriver() throws IOException {
	Properties props = new Properties();
	FileInputStream fis = new FileInputStream("D:\\seleniumProject\\E2Eproject\\src\\main\\java\\Academy\\E2Eproject\\data.properties");
	props.load(fis);
	String browserName = props.getProperty("Browser");
	if(browserName=="chrome") {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromeDriver.exe");
		driver = new ChromeDriver();
	}
	return driver;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
