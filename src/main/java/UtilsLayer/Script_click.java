package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Script_click extends BaseClass {

	public static void clickOnLinek(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);
		//If we have ID locator then use below method and no need to take wb
		//js.executeScript("document.getElementById('value_of_ID_Loacator').click();");
	}
	public static void clickOnButton(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);
		//If we have ID locator then use below method and no need to take wb
		//js.executeScript("document.getElementById('value_of_ID_Loacator').click();");
	}
	public static void clickOnCheckBox(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);
		//If we have ID locator then use below method and no need to take wb
		//js.executeScript("document.getElementById('value_of_ID_Loacator').click();");
	}
	
}
