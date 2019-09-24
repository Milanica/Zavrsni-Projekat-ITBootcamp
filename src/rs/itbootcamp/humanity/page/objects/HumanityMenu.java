package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	public static final String URL = "https://humanit.humanity.com/app/dashboard/";
	private static final String DASHBOARD_XPATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFT_PLANNING_XPATH = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIME_CLOCK_XPAT = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_XPATH = "//p[contains(text(),'Time Clock')]";
	private static final String TRAINING_XPATH = "//p[contains(text(),'Training')]";
	private static final String STAFF_XPATH = "//p[contains(text(),'Staff')]";
	private static final String PLAYROLL_XPATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORT_XPATH = "//i[@class='primNavQtip__icon icon-chart']";
	private static final String SETTINGS_BAR_XPATH = "//i[@class='primNavQtip__icon icon-gear']";

	// pristup dashboard button-u
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
	}

	// medoda za klik na dashboard dugme
	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

	// pristup shift planning button-u
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_XPATH));
	}

	// medoda za klik na dashboard dugme
	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}

	// pristup time clock button-u
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK_XPAT));
	}

	// metoda za klik na time clock button
	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// pristup leave buttonu
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	// metoda za klik na time clock button
	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// pristup training dugme
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	// metoda za klik na training dugme
	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// pristup staff buttonu
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	// metoda za klik na staff dugme
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// pristup playroll buttonu
	public static WebElement getPlayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PLAYROLL_XPATH));
	}

	// metoda za klik na playroll dugme
	public static void clickPlayroll(WebDriver driver) {
		getPlayroll(driver).click();
	}

	// pristup report buttonu
	public static WebElement getReport(WebDriver driver) {
		return driver.findElement(By.xpath(REPORT_XPATH));
	}

	// metoda za klik na report dugme
	public static void clickReport(WebDriver driver) {
		getReport(driver).click();
	}

	// pristup Settings buttonu u gornjem meniju
	public static WebElement getSettingsBTN(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BAR_XPATH));
	}

	// metoda za klik na Settings button u gornjem meniju
	public static void clickSettingsBTN(WebDriver driver) {
		getSettingsBTN(driver).click();
	}
}
