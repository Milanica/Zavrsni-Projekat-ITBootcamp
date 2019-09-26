package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class AddEmployeesApachePoi {
	
	public static boolean LoginExcelApachePoi() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	
	String DATA_SOURCE = "Data PODACI.xls";
	driver.get(HumanityHome.URL1);
	HumanityHome.clickLoginButton(driver);
	
	if (driver.getCurrentUrl().contains(HumanityHome.URL1) == false) { 
   return false;
	}
	
	ExcelUtils.setExcell(DATA_SOURCE);
	ExcelUtils.setWorkSheet("Login");
	Thread.sleep(3000);
	driver.quit();
	
	String firstname, lastname, email, password;
	firstname= ExcelUtils.getDataAt(1, 0);
	password = ExcelUtils.getDataAt(1, 1);

	HumanityHome.fillUsernameInput(driver, firstname );
	HumanityHome.fillPasswordInput(driver, password);
	
	
	driver.quit();
	return true;
	
	
			
	
	
	
	
}
}

}
