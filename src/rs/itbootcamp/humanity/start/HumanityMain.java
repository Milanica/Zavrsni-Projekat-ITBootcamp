package rs.itbootcamp.humanity.start;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeesTestsExcel;
import rs.itbootcamp.humanity.page.tests.HumanityLogin1Excel;
import rs.itbootcamp.humanity.page.tests.HumanityPhotoTest;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityMain {

	public static final String URL1 = "https://www.humanity.com";

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL1);
		System.out.println("Dobrodosli u program za testiranje sajta www.humanity.com");
		
		HumanityLogin1Excel.testLogInExcel(driver);
		HumanityAddNewEmployeesTestsExcel.testAddNewEmployeesExcel(driver);
		HumanityPhotoTest.testPhotoUpload();
		
	}
}
//		
//		try {
//
//			HumanityHome.
//			System.out.println("If you want to enter registration and log in information by yourself, type 1");
//			System.out.println("If you want data to be loaded from the Excel file, type 2 ");
//
//		
//		HumanityLogin1Excel.testLogInExcel(driver);
//		
//		
//		
//		HumanityAddNewEmployeesTestsExcel.testAddNewEmployeesExcel(driver);
//		
//
