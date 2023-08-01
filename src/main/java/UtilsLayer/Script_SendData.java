package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Script_SendData extends BaseClass{
	public static void send_data(WebElement wb,String data)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+data+"';", wb);
	}

}
