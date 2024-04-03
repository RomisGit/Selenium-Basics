package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.navigate().back();   //Backward movement
	    driver.navigate().forward();//Forward movement
	    driver.navigate().refresh();
	    driver.navigate().to("https://www.seleniumeasy.com//"); //To navigate to a specific page.

	}

}
