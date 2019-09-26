package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	public static final String URL3 = "https://humanit.humanity.com/app/staff/list/load/true/";
	private static final String STAFF_XPATH = "//p[contains(text(),'Staff')]";
	private static final String ADD_EMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String FIRSTNAME_START_XPATH = "//input[@id='_asf";
	private static final String LASTNAME_START_XPATH = "//input[@id='_asl";
	private static final String EMAIL_START_XPATH = "//input[@id='_ase";
	private static final String START_EMPLOYEE_XPATH = "//a[contains(text)),'";
	private static final String END_XPATH = "']"; // razdvojila sam pocetne i krajnje stringove kako bih ih kasnije
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

	public static WebElement getEmployeesFirstName(WebDriver driver, int n) {
		return driver.findElement(By.xpath(FIRSTNAME_START_XPATH + n + END_XPATH)); // ovde sam spojila stringove , n je
																					// jedino stose razlikuje kod svakog
																					// zaposleno
	}

	public static void inputEmployeesFirstName(WebDriver driver, int n, String textInput) {
		getEmployeesLastName(driver, n).sendKeys("Milana");
	}

	// dodavanje prezimena radniku

	public static WebElement getEmployeesLastName(WebDriver driver, int n) {
		return driver.findElement(By.xpath(LASTNAME_START_XPATH + n + END_XPATH));

	}

	public static void inputEmployeesLastName(WebDriver driver, int n, String textInput) {
		getEmployeesLastName(driver, n).sendKeys("Stefanovic");
	}
	// dodavanje email adrese

	public static WebElement getEmployeesEmail(WebDriver driver, int n) {
		return driver.findElement(By.xpath(EMAIL_START_XPATH + n + END_XPATH));

	}

	public static void inputEmployeesEmail(WebDriver driver, int n, String textInput) {
		getEmployeesEmail(driver, n).sendKeys("nolarine@coin-host.net");

	}

	// "Save Employees" dugme
	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_BUTTON_XPATH));
	}

	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();
	}
}
