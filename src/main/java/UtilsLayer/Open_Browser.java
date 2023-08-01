package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;

import BaseLayer.BaseClass;

public class Open_Browser extends BaseClass{
	public static void openBrowser(String URL)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.location='"+URL+"';");
	}

}
