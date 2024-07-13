package cicdtestingqaautomation;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {
	
	
	WebDriver driver;
	
	@Test
	void openbro() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		
		driver.manage().window().maximize();
		
		
		driver.quit();
		
		
		
		
	}

}
