package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityLogin1Excel {

	public static final String URL1 = "https://www.humanity.com/app/";

	@Test
	public static boolean testLogInExcel(WebDriver driver) throws InterruptedException {


		String DATA_SOURCE = "Data PODACI.xls";
		HumanityHome.clickLoginButton(driver);

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		String username, password;
		username = ExcelUtils.getDataAt(1, 0);
		password = ExcelUtils.getDataAt(1, 1);

		HumanityHome.fillUsernameInput(driver, username);
		HumanityHome.fillPasswordInput(driver, password);

		HumanityHome.clickLoginBTN1(driver);
		Thread.sleep(3000);


		return true;

	}

}

//@Test
//public static boolean testLogInExcel(WebDriver driver) {
//
//	HumanityHome.clickLoginButton(driver);
//
//	String DATA_SOURCE = "Data PODACI.xls";
//	Assert.assertTrue();
//	ExcelUtils.setExcell(DATA_SOURCE);
//	ExcelUtils.setWorkSheet(0);
//
//	String username, password;
//	username = ExcelUtils.getDataAt(1, 0);
//	password = ExcelUtils.getDataAt(1, 1);
//
//	HumanityHome.fillUsernameInput(driver, username);
//	HumanityHome.fillPasswordInput(driver, password);
//
//	HumanityHome.clickLoginBTN1(driver);
//
//	return true;
//
//}
//
//}
