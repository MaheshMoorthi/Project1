package Locator;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 extends BaseClass{
	public page2() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath="//a[@class='dk_toggle dk_label']")
	private WebElement size;
	@FindBy(xpath="//a[text()='Add To Bag']")
	private WebElement bag;
	public WebElement getSize() {
		return size;
	}
	public WebElement getBag() {
		return bag;
	}
	
	

}
