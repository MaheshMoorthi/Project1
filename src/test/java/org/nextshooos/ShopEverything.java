package org.nextshooos;

import java.awt.AWTException;

import org.libglobal.BaseClass;
import org.testng.annotations.Test;

import Locator.page1;
import Locator.page2;

public class ShopEverything extends BaseClass {
	
	
	@Test
	public void method1() throws InterruptedException, AWTException {
		
		launchBrowser();
		launchUrl("https://www.next.com.au/en");
		page1 p1=new page1();
		page2 p2=new page2();
		selectProduct(p1.getBoys(), p1.getProduct());
		Thread.sleep(2000);
	chooseProduct(p1.getClkproduct());
	Thread.sleep(2000);
	addToBag( p2.getSize(), p2.getBag());

}
}