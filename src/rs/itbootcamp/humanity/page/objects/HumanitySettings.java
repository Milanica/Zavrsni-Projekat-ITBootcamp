package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {

	public static final String URL4 = "https://humanit.humanity.com/app/admin/settings/";
	private static final String SETTINGS_BAR_XPATH = "//i[@class='primNavQtip__icon icon-gear']";
	private static final String SELECT_COUNTRY_XPATH = "//select[@id='country']";
	private static final String DEFAULT_LANGUAGE_XPATH = "//select[@id='country']";
	private static final String TIME_FORMAT_XPATH = "//select[@name='pref_24hr']";

	// pristup Settings buttonu u gornjem meniju
	public static WebElement getSettingsBTN(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BAR_XPATH));
	}

	// metoda za klik na Settings button u gornjem meniju
	public static void clickSettingsBTN(WebDriver driver) {
		getSettingsBTN(driver).click();
	}

	// Select Country
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}

	// Select Default Language

	public static Select getDefaultLanguage(WebDriver driver) {
		return new Select (driver.findElement(By.xpath(DEFAULT_LANGUAGE_XPATH)));
	}

	public static void inputDefaultLanguage(WebDriver driver, String data) {
		getDefaultLanguage(driver).selectByVisibleText(data);
		
}
	// Select Time Format 

	public static Select getTimeFormat(WebDriver driver) {
		return new Select (driver.findElement(By.xpath(TIME_FORMAT_XPATH)));
	}

	public static void inputTimeFormat(WebDriver driver, String data) {
		getTimeFormat(driver).selectByVisibleText(data);
	}	
	
}
