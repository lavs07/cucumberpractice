package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Select sc;
	public static Actions ac;
	public static JavascriptExecutor js;
	
	
	
	
	public static void browserLaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\maven_sample\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void webdriverManager() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void getUrl(String Url) {
		driver.get(Url);
			
		}
	public static void sendKeys(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void sleep(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}
	public static void navigateBack() {
	    driver.navigate().back();
	}
	public static void navigateForward() {
	    driver.navigate().forward();
	}
	public static void navigateRefresh() {
	    driver.navigate().refresh();
	}
	public static void findElementsByTagname(String tagname) {
		List<WebElement> elements = driver.findElements(By.tagName(tagname));
		int size = elements.size();
		System.out.println(size);
	}
	public static void selectByIndex(WebElement element,int index) {
		sc=new Select(element);
		sc.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value) {
		sc=new Select(element);
		sc.selectByValue(value);
		
	}
	public static void selectByVisibleText(WebElement element,String text) {
		sc=new Select(element);
		sc.selectByValue(text);
	}
	public static void deselectByIndex(WebElement element,int index) {
		sc=new Select(element);
		sc.deselectByIndex(index);
	}
	public static void deselectByValue(WebElement element,String value) {
		sc=new Select(element);
		sc.deselectByValue(value);
	}
	public static void deselectBytext(WebElement element,String text) {
		sc=new Select(element);
		sc.deselectByVisibleText(text);
	}
	public static void deselectAll(WebElement element) {
		sc=new Select(element);
		sc.deselectAll();
		}
	public static void isMultiple(WebElement element) {
		sc=new Select(element);
	boolean multiple = sc.isMultiple();
	System.out.println(multiple);
	}
	public static void getOptions(WebElement element) {
		sc=new Select(element);
		List<WebElement> options=sc.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
			
		}
	}
		public static void simpleAlert() {
			driver.switchTo().alert().accept();
			
	}
		public static void confirmAlert1() {
			driver.switchTo().alert().accept();
	}
		public static void confirmAlert2() {
			driver.switchTo().alert().dismiss();
	}
		public static void promptAlert(String input) {
			driver.switchTo().alert().sendKeys(input);
			driver.switchTo().alert().accept();
	}
	
	public static void getSelectedOptions(WebElement element) {
		sc=new Select(element);
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		for(WebElement options:allSelectedOptions) {
			System.out.println(options.getText());
		}
	}
		public static void firstSelectedOption(WebElement element) {
			sc=new Select(element);
			WebElement firstoption=sc.getFirstSelectedOption();
			System.out.println(firstoption.getText());
	} 
		public static void contextClick(WebElement element) {
			 ac=new Actions(driver);
			 ac.contextClick(element).perform();
			}
		public static void doubleClick(WebElement element) {
			 ac=new Actions(driver);
			 ac.doubleClick(element).perform();	
		}
		public static void sendData(WebElement element,String data) {
			ac=new Actions(driver);
			ac.sendKeys(element, data).perform();
	}
		public static void mouseHover(WebElement element) {
			ac=new Actions(driver);
			ac.moveToElement(element).perform();
		}
		public static void dragAndDrop(WebElement source,WebElement destination) {
			ac=new Actions(driver);
			ac.dragAndDrop(source,destination).perform();
		}
		
		public static void frameByIndex(int index) {
			driver.switchTo().frame(index);
		}
		public static void frameByName(String name) {
			driver.switchTo().frame(name);
		}
		public static void frameByWebelement(WebElement element) {
			driver.switchTo().frame(element);
			
		}
		public static void getTextInt(WebElement element) {
			String text1 = element.getText();
			System.out.println(text1);
			
			String price="";
			for(int i=0;i<text1.length();i++) {
				char ch=text1.charAt(i);
				if(Character.isDigit(ch)) {
			      price=price+ch;
				}
				
			}
	
			//System.out.println(price);
					int price1 = Integer.parseInt(price);
					System.out.println("converted into int :" +price1);
	
				}
		public static String getText(WebElement element) {
//			String text1 = element.getText();
//			System.out.println(text1);
			return element.getText();
		}
		public static void jsClick(WebElement element)
		{
			js=(JavascriptExecutor)driver;	
			js.executeScript("arguments[0].click()", element);
		}
		
		public static WebElement jsScroll(WebElement element) {
			try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			}catch (Exception e) {
				throw new RuntimeException("Warning: Unable to move focus to an Element");
			}
			return element;
		}
		
		
		
		
		
			public static void getWindowHandles() 
			{
				String homewindow=driver.getWindowHandle();
				Set<String> windows=driver.getWindowHandles();
				for (String window : windows) {
					if(!homewindow.equals(window))
					{
						driver.switchTo().window(window);
						
						
									}
				}
			}
			
		
		public static String getAttribute(WebElement element,String attrName)
		{
		return element.getAttribute(attrName);
		}
		public static void jsSetAttribute(String attrName,String attrValue,WebElement element)
		{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('"+attrName+"','"+attrValue+"')",
		element);
		}
		public static String jsGetAttribute(String attrName,WebElement element)
		{
		js=(JavascriptExecutor)driver;
		String value=(String)js.executeScript("return arguments[0].getAttribute('"+attrName+"')", element);
		return value;
		}
		// reusable methods for findelement
		public static WebElement findElementId(String id) {
			return driver.findElement(By.id(id));
			
		}
		public static WebElement findElementName(String name) {
			return driver.findElement(By.name(name));
			
		}
		public static WebElement findElementXpath(String Name) {
			return driver.findElement(By.xpath(Name));
			
		}
		public static WebElement findElementBy(By By) {
			return driver.findElement(By);
			
		}
//		public static void sleep(long mseconds) throws InterruptedException {
//	        Thread.sleep(mseconds);
//			}
		public static String getCellData(int i,int j) {
			String value=null;
			try {
			File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\maven_sample\\src\\test\\resources\\Excelfile\\ExcelReader.xlsx");
			FileInputStream fs=new FileInputStream(f);
			try {
				Workbook wb=new XSSFWorkbook(fs);
				Sheet sh= wb.getSheet("Sheet1");
				 Row row=sh.getRow(i);
				 Cell cell=row.getCell(j);
				 int celltype=cell.getCellType();
				 if(celltype==1) {
					 value=cell.getStringCellValue();
					 //System.out.println(value);
				 }else if(celltype==0) {
					 if(DateUtil.isCellDateFormatted(cell)) {
						 Date cellValue = cell.getDateCellValue();
						 SimpleDateFormat sm=new SimpleDateFormat("dd/MM/yyyy");
						 value=sm.format(cellValue);
						 //System.out.println(cellValue);
						 }else {
							 double cellValue = cell.getNumericCellValue();
							 long lg=(long)cellValue;
							 value=String.valueOf(lg);
							// System.out.println(value);
						 }
				 }
			}catch (IOException e) {
			}
		}
		
		catch(FileNotFoundException e) {
		}

			
			return value;

}
		public static void sendKeys1(WebElement search, Keys enter) {
	
			
			
		}
		
		
			
		}



