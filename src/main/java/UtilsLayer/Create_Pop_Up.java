package UtilsLayer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import BaseLayer.BaseClass;

public class Create_Pop_Up extends BaseClass{
	public static void alert_pop(String massage)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+massage+"');");
		//Then to accept pop-up use alert instance to switch and accept
//		Alert alt =driver.switchTo().alert();
//		Thread.sleep(5000);
//		alt.accept();
//		alt.dismiss();
		
	}
	public static void confirm_pop(String massage)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("confirm('"+massage+"');");
	}
	public static void prompt_pop(String massage)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("prompt('"+massage+"');");
	}

}
