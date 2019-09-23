package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com";
	private static final String ABOUT_US_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN_BTN1_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String USERNAME_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@id='password']";
	private static final String CLIC_LOGIN_BTN1_XPATH = "//button[contains(text(),'Log in')]";
	private static final String FULL_NAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_FREETRIAL_XPATH = "//input[@id='free-trial-link-01']";

	// pristup about us dugme
	public static WebElement getAboutUsButton(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}

	// medoda za klik na about us dugme
	public static void clickAboutUsButton(WebDriver driver) {
		getAboutUsButton(driver).click();
	}

	// pristup login btn u gornjem meniju
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BTN1_XPATH));
	}

	// klik na log in button u gornjem meniju
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	// pristup username input dugmetu
	public static WebElement getEmailInput(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_XPATH));
	}

	// unosenje username-a u polje
	public static void fillEmailInput(WebDriver driver, String inputText) {
		getEmailInput(driver).sendKeys(inputText);
	}

	// pristup polju password
	public static WebElement getPasswordInput(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	// metoda za unosenje passworda u polje
	public static void fillPasswordInput(WebDriver driver, String inputText) {
		getPasswordInput(driver).sendKeys(inputText);
	}

	// pristup za klik na dugme log in nakon unosenja lozinke i sifre
	public static WebElement getLoginBTN1(WebDriver driver) {
		return driver.findElement(By.xpath(CLIC_LOGIN_BTN1_XPATH));
	}

	// klik na dugme log in nakon unosenja lozinke i sifre
	public static void clickLoginBTN1(WebDriver driver) {
		getLoginBTN1(driver).click();
	}

	// pristup polju full name
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_XPATH));
	}

	// metoda za unosenje full name-a u polje
	public static void inputFullName(WebDriver driver, String inputText) {
		getFullName(driver).sendKeys(inputText);

	}

	// pristup polju work email
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_XPATH));
	}

	// metoda za unosenje podataka work email-a u polje
	public static void inputWorkEmail(WebDriver driver, String inputText) {
		getFullName(driver).sendKeys(inputText);
	}

	// start my free trial polje
	public static WebElement getStartFreeTrialBTN(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREETRIAL_XPATH));
	}

// metoda da se klikne dugme start free trial
	public static void clickStartFreeTrialBTN(WebDriver driver) {
		getStartFreeTrialBTN(driver).click();
	}
}
