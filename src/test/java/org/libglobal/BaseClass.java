package org.libglobal;

import java.awt.AWTException;
import java.awt.Robot;
//import java.awt.event.KeyEvent;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public WebDriver launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\eclipse-workspace\\Shoes\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public void launchUrl( String url) throws InterruptedException, AWTException {
		
		driver.get(url);
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("refreshed");
	}
	
	public void flagClose(WebElement flag) {
		try {
			flag.click();
			
		} catch (Exception e) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", flag);
		}

	}
	public void fillText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void selectProduct(WebElement element, WebElement element2) throws InterruptedException {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		Thread.sleep(2000);
		a.moveToElement(element2).click().perform();
	}
	public void addToBag(WebElement size, WebElement bag) throws InterruptedException, AWTException {
		
			size.click();
			Actions a=new Actions(driver);
			a.sendKeys(Keys.DOWN).perform();
			a.sendKeys(Keys.DOWN).perform();
			a.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			bag.click();
			
	}
	
	public void chooseProduct( WebElement element) {
		element.click();

	}
	
	
	
	
	
	

}
