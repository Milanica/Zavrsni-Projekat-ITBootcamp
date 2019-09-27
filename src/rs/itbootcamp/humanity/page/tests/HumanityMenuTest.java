package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityMenuTest {
	@Test
	public static void testAppVersion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			
			driver.get(HumanityHome.URL1); // odlazi na Humanity home stranicu
			driver.manage().window().maximize();
			HumanityHome.clickLoginButton(driver); // klikne na dugme login
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			HumanityHome.clickUsernameInput(driver); // klinkne na "Email/Username" polje
		    String data= "nolarine@coin-host.net";
			HumanityHome.fillUsernameInput(driver, data); // ukuca podatke  "Email/Username"
			HumanityHome.clickPasswordInput(driver); // klikne na "Password" polje
			HumanityHome.fillPasswordInput(driver, data); // ukuca validnu sifru
			HumanityHome.clickLoginBTN1(driver); // klikne na login dugme da submituje
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(5000);

		} catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		} finally {

			driver.quit(); // zatvara se program
		}
	}
}
