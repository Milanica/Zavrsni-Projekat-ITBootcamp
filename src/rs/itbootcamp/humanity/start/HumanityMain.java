package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityAddEmployeeExcel;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityMain {
	
	public static final String URL1 = "https://www.humanity.com";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Dobrodosli u program za testiranje sajta www.humanity.com");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL1);
		
		HumanityAddEmployeeExcel.testLogInExcell(driver);
		




	}
}
