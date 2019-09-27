package rs.itbootcamp.humanity.page.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityAddNewEmployeesTestsExcel {

	public static boolean testAddNewEmployeesExcel(WebDriver driver) throws InterruptedException, IOException {
		/*
		 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); WebDriver
		 * driver = new ChromeDriver();
		 */
//
//			String DATA_SOURCE = "Data PODACI.xls";
//			driver.get(HumanityStaff.URL3);
//			
//			HumanityStaff.clickAddEmployeeButton(driver);
//
//
//			ExcelUtils.setExcell(DATA_SOURCE);
//			ExcelUtils.setWorkSheet(1);
//			Thread.sleep(3000);
//
//			int n = ExcelUtils.getRowNumber();
//			for (int i = 1; i < n; i++) {
//
//				String firstname, lastname, email;
//				firstname = ExcelUtils.getDataAt(i, 0);
//				lastname = ExcelUtils.getDataAt(i, 1);
//				email = ExcelUtils.getDataAt(i, 2);
//
//				HumanityStaff.inputEmployeesFirstName(driver, firstname, i);
//				HumanityStaff.inputEmployeesLastName(driver, lastname, i);
//				HumanityStaff.inputEmployeesEmail(driver,  email, i);
//			}
//			ExcelUtils.closeExcell();
//			HumanityStaff.clickSaveEmployeesButton(driver);
//		
//			Thread.sleep(3000);
//			driver.quit();
//			return true;
//
//		}
		Thread.sleep(5000);
		HumanityMenu.clickStaff(driver);
		Thread.sleep(5000);

		HumanityStaff.clickAddEmployeeButton(driver);

		String srcFile = "Data PODACI.xls";
		File src = new File(srcFile);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wbe.getSheetAt(1);
		int rowcount = sheet1.getLastRowNum();

		try {
			for (int i = 1; i < rowcount; i++) {
				HSSFRow r = sheet1.getRow(i);
				if (r != null) {
					String firstname = r.getCell(0).getStringCellValue();
					String lastname = r.getCell(1).getStringCellValue();
					String email = r.getCell(2).getStringCellValue();

					HumanityStaff.inputEmployeesFirstName(driver, firstname, i);
					HumanityStaff.inputEmployeesLastName(driver, lastname, i);
					HumanityStaff.inputEmployeesEmail(driver, email, i);
				}

				else {
					HumanityStaff.clickSaveEmployeesButton(driver);
				}
				wbe.close();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			HumanityStaff.clickSaveEmployeesButton(driver);
			HumanityMenu.clickStaff(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Thread.sleep(5000);
		}
		return true;
	}
}
