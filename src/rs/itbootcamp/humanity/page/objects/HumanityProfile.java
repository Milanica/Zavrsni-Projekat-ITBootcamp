package rs.itbootcamp.humanity.page.objects;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {

	public static final String URL2 = "https://humanit.humanity.com/app/dashboard/";
	private static final String AVATAR_XPATH = "//img[@id='tr_avatar']";
	private static final String SELECT_OPTION_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String PROFILE_BTN_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_BTN_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_BTN_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')] ";
    private static final String SIGNOUT_BTN_XPATH = "//a[contains(text(),'Sign Out')]";
    private static final String APP_VERSION_XPATH = "//b[contains(text(),'9.5.5')]";
    
	// metoda da se pristupi avataru
	public static WebElement getAvatar(WebDriver driver) {
		return driver.findElement(By.xpath(AVATAR_XPATH));
	}

	// medoda za klik na avatar
	public static void clickAvatar(WebDriver driver) {
		getAvatar(driver).click();
	}

	//  drop down option ( klik na strelicu opadajuci meni)
	public static WebElement getDropDownMenu(WebDriver driver) {
		return driver.findElement(By.xpath(SELECT_OPTION_XPATH));
	}

	// medoda za klik na strelicu opadajuci meni
	public static void clickDropDownMenu(WebDriver driver) {
		getDropDownMenu(driver).click();
	}

	// metoda da se pristupi polju Profile
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_BTN_XPATH));
	}

	// medoda za klik na Profile polje
	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}

	// metoda da se pristupi polju Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BTN_XPATH));
	}

	// medoda za klik na polje Settings
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}

	// metoda da se pristupi polju Availability
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_BTN_XPATH));
	}

	// medoda za klik na dugme Availability
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	// metoda da se pristupi polju Sign out
		public static WebElement getSignOut(WebDriver driver) {
			return driver.findElement(By.xpath(SIGNOUT_BTN_XPATH));
		}

	// medoda za klik na dugme Sign out
		public static void clickSignOut(WebDriver driver) {
			getSignOut(driver).click();
		}
	// metoda da se pristupi verziji aplikacije
		public static WebElement getAppVersion(WebDriver driver) {
		    return driver.findElement(By.xpath(APP_VERSION_XPATH));
		}

}
