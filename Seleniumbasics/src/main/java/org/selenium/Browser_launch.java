package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 WebDriver driver1=new FirefoxDriver();
		// driver1.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		//driver.close();

	}

}
