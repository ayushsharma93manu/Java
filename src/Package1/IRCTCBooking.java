package Package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IRCTCBooking {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/AyushMoudgil/JavaProgramming/exefiles/geckodriver");
	
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.air.irctc.co.in/");
		EventFiringWebDriver efb=new EventFiringWebDriver(driver);
		File srcfile = efb.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Sharukh/ayush.png");
		FileUtils.copyFile(srcfile, destfile);
		
		
		
	
		
	}

}
