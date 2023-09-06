package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		// Set up the ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void passText(String text, WebElement element) {
		element.sendKeys(text);

	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickbtn(WebElement ele) {
		ele.click();

	}

	public static void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location + imgname.png");
		FileUtils.copyDirectory(image, f);

	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {

		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();

	}

	public static void dragAndDrop(WebElement dragwebelement, WebElement dropwebelement) {

		a = new Actions(driver);
		a.dragAndDrop(dragwebelement, dropwebelement);
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarwebele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", tarwebele);
	}

	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Sheetname");
		Row row = mysheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();

		if (cellType == 1) {
			String value = cell.getStringCellValue();

			System.out.println(value);

		}

		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			// convert date to string
			SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy");
			String forvalue = s.format(dateCellValue);

			// System.out.println(forvalue);
		}

		else {
			double d = cell.getNumericCellValue();

			long l = (long) d;

			// convert to string
			String valueOf = String.valueOf(l);
			// System.out.println(valueOf);

		}

	}

	public static void createNewExcelFile(int rownum, int cellnum, String writedata) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenSample\\Excel\\name.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("sheetname");
		Row newRow = newSheet.createRow(0);
		Cell newCell = newRow.createCell(0);
		newCell.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(f);
	    w.write(fos);	
		
	}

	
	public static void createCell(int getRow,int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenSample\\Excel\\name.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Sheetname");
		Row row = mysheet.getRow(getRow);
		Cell cell = row.createCell(creCell);
		cell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
	    wb.write(fos);
		
		
		}
	
	public static void createRow(int creRow,int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenSample\\Excel\\name.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Sheetname");
		Row row = mysheet.createRow(creRow);
		Cell cell = row.createCell(creCell);
		cell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
	    wb.write(fos);
		
		
		}
	
	public static void updateDataToParticularCell(int getRow,int getCell,String existingData ,String writeNewData) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenSample\\Excel\\name.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Sheetname");
		Row row = mysheet.getRow(getRow);
		Cell cell = row.getCell(getCell);
		String str = cell.getStringCellValue();
		if (str.equals(existingData)) {
			cell.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
	    wb.write(fos);
	}
	
}
