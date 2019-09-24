package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	public static final String URL = "https://humanit.humanity.com/app/staff/list/load/true/";
	private static final String STAFF_XPATH = "//p[contains(text(),'Staff')]";
	private static final String ADD_EMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String FIRSTNAME_START_XPATH = "//input[@id='_asf";
	private static final String LASTNAME_START_XPATH = "//input[@id='_asl";
	private static final String EMAIL_START_XPATH = "//input[@id='_ase";
	private static final String START_EMPLOYEE_XPATH = "//a[contains(text)),'";
	private static final String END_XPATH = "']"; // razdvojila sam pocetne i krajnje stringove kako bi ih kasnije
													// spojila, zato sto su zajednicki za svakog zapsolenog
	private static final String SAVE_BUTTON_XPATH = "//button[@id='_as_save_multiple']";

	// pristup staff buttonu
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	// metoda za klik na staff dugme
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// metoda koja pristupa dugmetu "Add Employee"
	public static WebElement getAddEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_BUTTON_XPATH));
	}

	// metoda koja ce kliknuti na dugme "Add Employee"
	public static void clickAddEmployeeButton(WebDriver driver) {
		getAddEmployeeButton(driver).click();
	}

	// dodavanje imena radniku

	public static WebElement getInputFirstName(WebDriver driver, int n) {
		return driver.findElement(By.xpath(FIRSTNAME_START_XPATH + n + END_XPATH)); // ovde sam spojila stringove , n je
																					// jedino stose razlikuje kod svakog
																					// zaposlenog

	}

	public static boolean setInputFirstName(WebDriver driver, int n, String textInput) {
		getInputFirstName(driver, n).sendKeys(textInput);
		return true;
	}

	// dodavanje prezimena radniku

	public static WebElement getInputLastName(WebDriver driver, int n) {
		return driver.findElement(By.xpath(LASTNAME_START_XPATH + n + END_XPATH));

	}

	public static boolean setInputLastName(WebDriver driver, int n, String textInput) {
		getInputLastName(driver, n).sendKeys(textInput);
		return true;
	}
	// dodavanje email adrese

	public static WebElement getInputEmail(WebDriver driver, int n) {
		return driver.findElement(By.xpath(EMAIL_START_XPATH + n + END_XPATH));

	}

	public static boolean setInputEmail(WebDriver driver, int n, String textInput) {
		getInputEmail(driver, n).sendKeys(textInput);
		return true;
	}

	// Zaposleni kao celina: spajanje imena, prezimena i emaila
	public static boolean setEmployee(WebDriver driver, int n, String firstname, String lastname, String email) {
		setInputFirstName(driver, n, firstname);
		setInputLastName(driver, n, lastname);
		setInputEmail(driver, n, email);
		return true;

	}

	// "Save Employees" dugme
	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_BUTTON_XPATH));
	}

	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();
	}

	// dodavanje radnika preko for petlje
//
//	public static void setData(WebDriver driver, int n) {
//		for (int i = 1; i <= n; i++) {
//			String firstname = "Milana" + i;
//			String firstnameXpath = FIRSTNAME_START_XPATH + i + END_XPATH;
//			String lastname = "Svilar" + i;
//			String lastnameXpath = LASTNAME_START_XPATH + i + END_XPATH;
//			String email = "nolarine" + i + "@coin-host.net";
//			String emailXpath = EMAIL_START_XPATH + i + END_XPATH;
//			driver.findElement(By.xpath(firstnameXpath)).sendKeys(firstname);
//			driver.findElement(By.xpath(lastnameXpath)).sendKeys(lastname);
//			driver.findElement(By.xpath(emailXpath)).sendKeys(email);
//		}
//		driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();

	}


