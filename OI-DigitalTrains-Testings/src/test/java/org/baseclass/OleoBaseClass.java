package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OleoBaseClass {
	public static void elementClick(WebElement element) {
		element.click();

	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static WebDriver driver;

	public static void launchChromeBrowser() {
		 
		 System.setProperty("webdriver.chrome.driver","//Users/hemkumardevarajan/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("headless");		
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public static void screenMaximize() {
		driver.manage().window().maximize();

	}

	public static void closeTab() {
		driver.close();

	}

	public static void quitTab() {
		driver.quit();
	}

	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public static void wait1Seconds() throws InterruptedException {
		Thread.sleep(1000);

	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static Robot r;

	public static void controlKeypress() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);

	}

	public static void controlKeyrelease() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void aKeypress() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_A);

	}

	public static void aKeyrelease() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_A);

	}

	public static void enterKeyPress() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);

	}

	public static void enterKeyRelease() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void rightArowKeypress() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);

	}

	public static void rightArowKeyrelease() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_RIGHT);

	}

	public static void deleteKeypress() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);

	}

	public static void deleteKeyrelese() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_DELETE);

	}

	public static void tabKeyPress() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);

	}

	public static void tabKeyRelease() throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static Actions a;

	public static void mouseOverAction(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();

	}

	public static void dragAndDrop(WebElement Source, WebElement Dest) {
		a = new Actions(driver);
		a.dragAndDrop(Source, Dest).perform();

	}

	public static void clickAndHold(WebElement element) {
		a = new Actions(driver);
		a.clickAndHold(element).perform();

	}

	public static void deleteAction(WebElement element) {
		a = new Actions(driver);
		a.keyDown(element, Keys.BACK_SPACE).perform();
		a.keyUp(element, Keys.BACK_SPACE).perform();

	}

	public static Select s;

	public static void selectByIndex(WebElement element, int num) {
		s = new Select(element);
		s.selectByIndex(num);

	}

	public static void selectByValue(String value) {
		s.selectByValue(value);

	}

	public static void selectByVissibleText(String text) {
		s.selectByVisibleText(text);

	}

	public static void deselectByIndex(int num) {
		s.deselectByIndex(num);

	}

	public static void deselectByValue(String value) {
		s.deselectByValue(value);

	}

	public static void deselectByVissibleText(String text) {
		s.deselectByVisibleText(text);

	}

	public static void isMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void deselectByAll() {
		s.deselectAll();

	}

	public static void screenShort(String folderpath) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(folderpath);
		FileUtils.copyFile(src, dest);

	}

	public static void printText(WebElement element) {
		System.out.println(element.getText());
	}

	public static JavascriptExecutor js;

	public static void jsPassValue(WebElement element, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + value + "')", element);

	}

	public static void jsGetValue(WebElement element) {
		js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	public static void jsClick(WebElement element) {
		js.executeScript("arguments[0].Click()", element);

	}

	public static void scrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void wait5seconds() throws InterruptedException {
		Thread.sleep(5000);

	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public static void waitAndClickElement(String locater) {
		
		By loadingImage = By.xpath(locater);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));

	}

	public static void expicetWait() {
		Wait w = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(Exception.class);

	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}

	public static void navigateForword() {
		driver.navigate().forward();

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}

	public static String excelRead(String path, String sheetname, int row, int cell) throws IOException {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetname);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(row);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(cell);
				int cellType = c.getCellType();
				String sc;
				if (cellType == 1) {
					sc = c.getStringCellValue();
					System.out.println(sc);
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
					sc = sdf.format(d);
				} else {
					double b = c.getNumericCellValue();
					long l = (long) b;
					sc = String.valueOf(l);
				}
				return sc;
			}

		}
		return sheetname;

	}

	public static void createCell(String path, String name, int row, int cell, String value) throws IOException {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(name);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);

	}

	public static String getCell( int row, int cell) throws IOException {
		File f = new File("/Users/hemkumardevarajan/eclipse-workspace/OleoInternationalDigitaltrains-Testing/OleoInternationalDigitaltrains-Testing/OleoInternationalDigitaltrains-Testing/Excel/Simulation input.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Rail Profile");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat();
			value = sdf.format(d);
		}
		else {
			double a = c.getNumericCellValue();
			long l = (long) a;
			value = String.valueOf(l);
		}
		System.out.println(value);
		return value;
	
	}

	public static Alert aa;

	public static void alertAccept() {
		aa = driver.switchTo().alert();
		aa.accept();

	}

	public static void alertGetText() {
		aa = driver.switchTo().alert();
		String text = aa.getText();
		System.out.println(text);

	}

	public static void alertDismiss() {
		aa = driver.switchTo().alert();
		aa.dismiss();

	}

	public static void alertSendKeys(String value) {
		aa = driver.switchTo().alert();
		aa.sendKeys(value);

	}

	public static void switchToFrameIndex(int num) {
		driver.switchTo().frame(num);

	}

	public static void switchToFrameWebelement(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void switchToFrameName(String name) {
		driver.switchTo().frame(name);

	}

	public static void swichToParentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void goToMainMenu() {
		driver.switchTo().defaultContent();

	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		

	}

	public static void getAttributevalue(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);

	}

	public static void switchWindow() {
		String parentid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		for (String id : allwindowid) {
			if (parentid != id) {
				driver.switchTo().window(id);
			}
		}

	}
	

	public static void switchWindowList(int num) {
		String mainid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allwindowid);
		String id = li.get(num);

	}

	public static void switchWindowAndBack() {
		String parentid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		for (String id : allwindowid) {
			if (parentid != id) {
				driver.switchTo().window(id);
			}
		}
		driver.switchTo().window(parentid);

	}

	public static void tackscreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"/Users/hemkumardevarajan/eclipse-workspace/OleoInternationalDigitaltrains-Testing/OleoInternationalDigitaltrains-Testing/OleoInternationalDigitaltrains-Testing/Screenshot/Digitaltrains.png");
		FileUtils.copyFile(src, dest);

	}
	public static void getExcelValue(String path,String sheet ,int row ,int cell) throws IOException {
		
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
	}
	
	public static void countelement(String id) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> myTagsWithId = driver.findElements(By.xpath(id));
		System.out.println("Total tags with id as one of the attribute is : " + myTagsWithId.size());
		int size = myTagsWithId.size();
		if (size<2) {
			System.out.println("The connection part option is working properly");
			
		} else {
			System.out.println("The connection part are repreting not working properly");
		}
	
	}
	
	
	
	
}
