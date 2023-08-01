package TestLayer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.Capture;
import UtilsLayer.Create_Pop_Up;
import UtilsLayer.Open_Browser;
import UtilsLayer.Script_Navigate;
import UtilsLayer.Script_Scroll;
import UtilsLayer.Script_SendData;
import UtilsLayer.Script_click;
public class FB extends BaseClass {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		BaseClass.initilization("https://www.flipkart.com/");
		
		//WebElement wb=driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(5000);
		//Script_SendData.send_data(wb, "selenium");
		//Open_Browser.openBrowser("https://www.redbus.com");
		//Create_Pop_Up.alert_pop("Selenium");
//		Create_Pop_Up.confirm_pop("TestNG");
//		Alert alt =driver.switchTo().alert();
//		Thread.sleep(5000);
//		alt.accept();
//		Script_Navigate.back(1);
//		Script_Navigate.forward(1);
//		Script_Navigate.refresh();
//		Capture.innerHTML();
//		System.out.println("--------------------------------");
//		Capture.title();
//		System.out.println("--------------------------------");
//		Capture.url();
		Script_Scroll.scroll_down_Bypixcel(1000);
		
//		WebElement wb=driver.findElement(By.xpath("//h2[text()='Home & Kitchen Essentials']"));
//		Script_Scroll.scroll_into_view(wb);
	
	}

}
