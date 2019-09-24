package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityLoginTests {
	
    // Podaci:
    // email = "nolarine@coin-host.net";
    // password = "dobardan";
	
	
	
	@Test
	public static void testLogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	try
	{
		driver.get(HumanityHome.URL); // provera da li odlazi na webpage
		driver.manage().window().maximize();
		HumanityHome.clickLoginButton(driver); // provera da li klikne na login dugme
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HumanityHome.clickUsernameInput(driver); // klikne na polje "Email/Username"
		HumanityHome.fillUsernameInput(driver, "nolarine@coin-host.net"); // unosi podatak "Email/Username"
		HumanityHome.clickPasswordInput(driver); // klikne na polje "Password"
		HumanityHome.fillPasswordInput(driver, "dobardan"); // unosi sifru
		HumanityHome.clickLoginBTN1(driver); // klinkne na log in da submituje
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

		Assert.assertEquals(driver.getCurrentUrl(), HumanityMenu.URL, "Nesto nije u redu!"); // proverava da li se
																								// trenutna URL adresa
																								// poklapa sa navedenom

	}catch (AssertionError asser) {
		Assert.fail();
		System.out.println(asser.getMessage());
	}
	finally{

		driver.quit();
	}
}
}
