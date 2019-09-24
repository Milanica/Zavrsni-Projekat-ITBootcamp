package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;

public class HumanityMain {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Dobrodosli u program za testiranje sajta www.humanity.com");
		
		
		// pozivanje na website

		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// pozivanje metode

		HumanityLoginTests.testLogin();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
