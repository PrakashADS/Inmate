package com.inmate.publicdefender;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="D:\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\PublicUser_August.feature",
    		 	      		
		 plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotPublicUser",
		 "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Inmate_PublicUser_Sep10.html","json:cucumber.json"},
	   tags={
		
   
   //   "~@LoginPublicUser", 
        "~@NewMsg",
	   
       "~@NewPhoto",
	    "~@Inbox",   
     
	    "~@FindInmate",
	    "~@SortFindtheInmate",
	     
        "~@SortMyContacts",
        "~@SentPhotos",
     
     //  "~@CODpending", 
         "~@ArchivedMsg" ,
     
        "~@PurchaseCredit",   		
})

 public class RunPublicUser {
	@AfterClass
	public static void writeExtentReport() throws IOException {
		    Reporter.loadXMLConfig(new File(
				"D:\\Prakash_Automation\\Inmate\\src\\test\\java\\config\\test.xml"));
		    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		//  Reporter.addScreenCaptureFromPath("html:target/cucumber-html-report/ScreenshotPublicUser");
}
}	

