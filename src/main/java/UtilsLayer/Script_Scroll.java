package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Script_Scroll extends BaseClass {
	public static void scroll_down_Bypixcel(int pixcel)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+pixcel+");");
	}
	public static void scroll_into_view(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",wb);
	}
	
	

}
