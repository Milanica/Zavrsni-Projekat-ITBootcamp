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
		HumanityHome.fillUsernameInput(driver, "Milana"); //ukuca email ili username
		HumanityHome.clickPasswordInput(driver); //klikne na password
		HumanityHome.fillPasswordInput(driver, "dobardan"); //ukuca password
		HumanityHome.clickLoginBTN1(driver); //klikne login button i submituje
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		HumanityMenu.clickStaff(driver); //klikne na "Staff" button
		HumanityStaff.clickAddEmployeeButton(driver); //clicks on the "Add Employees" button
		HumanityStaff.inputEmployeesLastName(driver, n, textInput);//inputs the First name in the "First Name" field			
		HumanityStaff.inputEmployeesLastName(driver, n, textInput); //inputs the Last name in the "Last Name" field
		HumanityStaff.inputEmployeesEmail(driver, n, textInput);//inputs email in the "Email" field
		HumanityStaff.clickSaveEmployeesButton(driver); //clicks on the "Save Employees" button
						
		driver.navigate().back(); //returns the browser one page back
		driver.navigate().back(); //returns the browser to the "staff" page
		
		//makes a list of all elements that have xpath containing the name of the new employee
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Predrag Predragovic" + "')]"));
		Assert.assertTrue(list.size() > 0, "Text not found!"); //checks if the list has any items, if it does, the employee was successfully added
		
		}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		}finally {
			
			driver.quit(); //closes the Browser
		}
		
	}
}
