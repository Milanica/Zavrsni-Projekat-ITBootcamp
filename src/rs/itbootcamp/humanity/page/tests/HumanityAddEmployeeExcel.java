package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityAddEmployeeExcel {

	public static final String URL1 = "https://www.humanity.com/app/";
@Test
	public static boolean testLogInExcell(WebDriver driver) {

		String DATA_SOURCE = "Data PODACI.xls";

		HumanityHome.clickLoginButton(driver);
//		if (driver.getCurrentUrl().contains(URL1) == false) {
//			return false;
//		}

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		String username, password;
		username = ExcelUtils.getDataAt(1, 0);
		password = ExcelUtils.getDataAt(1, 1);

		HumanityHome.fillUsernameInput(driver, username);
		HumanityHome.fillPasswordInput(driver, password);

		HumanityHome.clickLoginBTN1(driver);

		return true;

	}

}
