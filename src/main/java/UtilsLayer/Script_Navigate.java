package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;

import BaseLayer.BaseClass;

public class Script_Navigate extends BaseClass{
	public static void back(int no)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(-"+no+");");
	}
	public static void forward(int no)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(+"+no+");");
	}
	public static void refresh()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
	}

}
