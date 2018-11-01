package com.inmate.publicdefender;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="D:\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicStaff.feature",
  
		 plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotPublicDefStaff",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Inmate_PublicDefenderStaff_Sep10.html","json:cucumber.json"},
	   tags={
     /*  "~@LoginPubStaff",
	 	 "~@RequestSearch", 
	     "~@ReplyTxtPdfBoth",
							
	 "~@InitiateMsg",
     "~@createNew",
	 "~@SearchMsgs",   
     "~@MsgToInmates1",  	
  	 "~@SortInitiateMessage",*/
 
})

    public class Run_PublicDefender_Staff { 
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(
				"C:\\Users\\prakashd\\New_Workspace_Automation\\Inmate\\src\\test\\java\\config\\test.xml"));
		    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
}
}		