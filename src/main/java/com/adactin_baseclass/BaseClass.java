package com.adactin_baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(String browserName) {
		
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			
			else {
				System.out.println("Browser is not launched");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	public static void getUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {

			e.printStackTrace();
		}
		}
		

	public static void navigateTo(String url1) {
		
		try {
			driver.navigate().to(url1);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	
	public static void navigateBack() {
		
		try {
			driver.navigate().back();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void navigateForward() {
		
		try {
			driver.navigate().forward();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void navigateRefresh() {
		
		try {
			driver.navigate().refresh();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void alerts(){
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
	}
	
	public static void actions_move(WebElement target) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(target).build().perform();
		
	}
	
	public static void actions_MoveClick(WebElement element) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(element).build().perform();
		
		a.click(element).build().perform();

	}
	
	public static void checkBox(WebElement target){
		
		try {
			target.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	public static void getText(WebElement element) {
		
		try {
			element.getText();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void enable(WebElement element){
		
		try {
			boolean enabled = element.isEnabled();
			System.out.println("Enabled or not:"+enabled);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void display(WebElement element) {
		
		try {
			boolean displayed = element.isDisplayed();
			System.out.println("Displayed or not"+displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void select(WebElement element) {
		
		try {
			boolean selected = element.isSelected();
			System.out.println("Selected or not"+selected);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void attribute(WebElement element, String value) {
		
		try {
			element.getAttribute(value);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void screenshot (String path) throws Throwable{
	
		try {
			TakesScreenshot snap = (TakesScreenshot) driver;
			File source = snap.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		}  catch (Exception e) {
			e.printStackTrace();
		}
	

}
	
	public static void scroll(WebElement element) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		}
	
	public static void inputElement(WebElement element, String value) {
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void click(WebElement element) {
		
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void is_Multiple(WebElement element) {
		try {
			Select s = new Select (element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void first_Selected(WebElement element) {
		try {
			Select s = new Select (element);
			WebElement firstSelected = s.getFirstSelectedOption();
			System.out.println("First Selected : "+firstSelected.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void all_Selected(WebElement element) {
		try {
			Select s = new Select (element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for(WebElement selected : allSelectedOptions) {
				System.out.println(selected.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void dropDown(WebElement element, String type, String values) {
		
		try {
			Select s = new Select (element);
			
			if (type.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(values);
				s.selectByIndex(parseInt);
			}
			
			else if(type.equalsIgnoreCase("byValue")){
				s.selectByValue(values);
			}
			else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(values);
			}
			else {
				System.out.println("Select is not here");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		}
	
	public static void frameOperations(String Type, String value, String Id, WebElement Element) {
		
		try {
			if (Type.equalsIgnoreCase("byIndex")) {
				
				int parseInt = Integer.parseInt(value);
				driver.switchTo().frame(parseInt);
					
			} 
			
			else if (Type.equalsIgnoreCase("byId")) {
				
				driver.switchTo().frame(Id);
				
			}
			
			else if(Type.equalsIgnoreCase("byElement")) {
				
				driver.switchTo().frame(Element);

			}
			
			else {
			
				System.out.println("Frame is Invalid");
}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	
	
	
	
}
	
	public static void robotDown(){
		
		try {
			Robot r = new Robot ();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void robotEnter() {
		
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

