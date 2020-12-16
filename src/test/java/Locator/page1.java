package Locator;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 extends BaseClass {
	public page1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	@FindBy(xpath="//a[@title='Boys']")
	private WebElement boys;
	@FindBy(xpath="(//li[@class='ComponentItem'])[12]")
	private WebElement product;
	
	@FindBy(xpath="(//h2[@class='Title'])[2]")
	private WebElement clkproduct;
	@FindBy(id="headerFlagSelector")
	private WebElement flag;
	
	public WebElement getFlag() {
		return flag;
	}
	public WebElement getClkproduct() {
		return clkproduct;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getBoys() {
		return boys;
	}
	public WebElement getProduct() {
		return product;
	}
	
	

}
