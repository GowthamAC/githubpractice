package Data;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	@DataProvider
public Object[][] data() throws EncryptedDocumentException, IOException {
	Object[][] aobj=new Object[1][1];
	
	FileInputStream fis=new FileInputStream("./Book1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	aobj[0][0]=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	return aobj;
}
	@Test(dataProvider = "data")
	public void test(String name) {
	//  WebDriverManager.chromedriver().create();
	WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
	}
}
