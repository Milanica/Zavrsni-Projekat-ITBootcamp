package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HumanityMain {
	
     public static String URL= "https://www.humanity.com/";
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS );
			driver.get(URL);
			
		}	
}
	