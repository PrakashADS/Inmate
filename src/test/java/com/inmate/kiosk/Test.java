package com.inmate.kiosk;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Test {
	WebDriver obj;
 
	public void beforeMethod() {
		

		      System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver.exe");  
			  obj=new ChromeDriver();
		    
		  	  obj.get("http://inmatecr01.sgssys.info/");
		  	  obj.manage().window().maximize();
		  	  obj.manage().logs().getClass();
		  	  obj.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS); 
		  }
}