package rs.itbootcamp.humanity.page.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTestNG {
	
	@Test
	public static void testAddNewEmployee() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	try {
		driver.get(HumanityHome.URL1); //odlazi na sajt www.humanity.com
		driver.manage().window().maximize();
		HumanityHome.clickLoginButton(driver); //klikne na log in pocetno dugme
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HumanityHome.clickUsernameInput(driver);; //klikne na "Email/Username" polje
		HumanityHome.fillUsernameInput(driver, "nolarine@coin-host.net"); //ukuca email ili username
		HumanityHome.clickPasswordInput(driver); //klikne na password
		HumanityHome.fillPasswordInput(driver, "dobardan"); //ukuca password
		HumanityHome.clickLoginBTN1(driver); //klikne login button i submituje
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		HumanityMenu.clickStaff(driver); //klikne na "Staff" button
		HumanityStaff.clickAddEmployeeButton(driver); //klikne na  "Add Employees" button

		HumanityStaff.inputEmployeesFirstName(driver, "Ivana", 1);
		HumanityStaff.inputEmployeesLastName(driver, "Peric", 1);
		HumanityStaff.inputEmployeesEmail(driver, 	"ivanica1234gh@gmail.com", 1);
		HumanityStaff.clickSaveEmployeesButton(driver);
		Thread.sleep(3000);
		driver.get(HumanityStaff.URL3);
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'ivana Peric')]"));
		Assert.assertTrue(list.size() > 0, "Tekst nije pronadjen!"); 
	
	}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
	}finally {
			
			driver.quit(); //closes the Browser
		}
		
	}
}
