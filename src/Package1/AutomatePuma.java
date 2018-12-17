package Package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomatePuma {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/AyushMoudgil/JavaProgramming/exefiles/geckodriver");
	
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.puma.com/men.html");
//		String htmlpage = driver.getPageSource();
//		System.out.println(htmlpage);
		List<WebElement> outerlnks = driver.findElements(By.xpath("//a[@class='digimeg-nav-item']"));
		
		int count = outerlnks.size();
		System.out.println(count);
		Thread.sleep(4000);
		for(int i=0;i<count;i++)
		{
			System.out.println(outerlnks.get(i).getText());
			Actions act=new Actions(driver);
			act.moveToElement(outerlnks.get(i)).perform();	
			
			
			List<WebElement> innerlnk = driver.findElements(By.xpath("//a[contains(@href,'https://in.puma.com')]"));
			
//			innerlnk.size();
			
			
			for(int j=0;i<innerlnk.size();i++)
			{
				System.out.println(innerlnk.get(j).getText());
			}
			
		}
		
	}
	
}
