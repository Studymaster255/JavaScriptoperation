package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;

import BaseLayer.BaseClass;

public class Capture extends BaseClass {
	
	public static void title()
	{
		js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.title;").toString());
	}
	public static void url()
	{
		js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.URL;").toString());
	}
	public static void innerHTML()
	{
		js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.documentElement.innerHTML;").toString());
	}

}
