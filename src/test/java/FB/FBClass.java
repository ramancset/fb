package FB;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBClass 
{
	
	Logger log = LogManager.getLogger(FBClass.class);
	@Test

	public  void fbMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		log.info("Opening chrome browser");
		driver.get("https://www.facebook.com/");
		log.info("URL Entered");
		System.out.println(driver.getTitle());
		System.out.println("Raman");


	}

}
