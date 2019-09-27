package rs.itbootcamp.humanity.page.tests;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
	

	public class HumanityPhotoTest {
		
		
		public static boolean testPhotoUpload() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(HumanityHome.URL1);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			HumanityHome.clickLoginButton(driver);
		    HumanityHome.fillUsernameInput(driver, "nolarine@coin-host.net");
			HumanityHome.fillPasswordInput(driver, "dobardan");
			HumanityHome.clickLoginBTN1(driver);
			HumanityMenu.clickStaff(driver);
			HumanityStaff.clickAddEmployeeButton(driver);
			HumanityStaff.inputEmployeesFirstName(driver, "Ivana", 1);
			HumanityStaff.inputEmployeesLastName(driver, "Peric", 1);
			HumanityStaff.inputEmployeesEmail(driver, 	"ivanica1234gh@gmail.com", 1);
			HumanityStaff.clickSaveEmployeesButton(driver);
			HumanityMenu.clickStaff(driver);
			HumanityProfile.clickDropDownMenu(driver);
			HumanityProfile.clickProfile(driver);
			HumanityEditStaff.clickEditDetails(driver);
			HumanityEditStaff.getUploadPicture(driver);
			HumanityEditStaff.uploadPicuture(driver);

			Thread.sleep(5000);
			driver.quit();
			return true;

		}
	}

