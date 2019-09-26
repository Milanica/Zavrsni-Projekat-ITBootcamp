package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL3 = "https://humanit.humanity.com/app/staff/list/load/true/";
	private static final String STAFF_XPATH = "//p[contains(text(),'Staff')]";
	private static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE_XPATH = "//input[@id='fileupload']";
	private static final String NICK_NAME_XPATH = "//input[@id='nick_name']";
	private static final String SAVE_EMPLOYEE_BTN_XPATH = "//button[@id='act_primary']";
	private static final String PICTURE_PICPATH = "C:\\Users\\pc\\Desktop";

	// pristup staff buttonu
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	// metoda za klik na staff dugme
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// pristup Edit details buttonu
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

	// metoda za klik na Edit details dugme
	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}

	// pristup za Upload picture
	public static WebElement getUploadPicture(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PICTURE_XPATH));
	}


	// Upload picture
	public static void uploadPicuture(WebDriver driver, String inputText) {
		getUploadPicture(driver).sendKeys(PICTURE_PICPATH);
	}

	// pristup za nickname
	public static WebElement getNickName(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_NAME_XPATH));
	}

	// metoda za klik na nickname button
	public static void clickNickName(WebDriver driver) {
		getNickName(driver).click();
	}

	// unosenje nick name-a
	public static void fillNickName(WebDriver driver, String inputText) {
		getNickName(driver).sendKeys(inputText);

	}

	// pristup Save Employee
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_BTN_XPATH));
	}

	// metoda za klik na Save Employee
	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
