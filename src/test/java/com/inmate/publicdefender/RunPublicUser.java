package com.inmate.publicdefender;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\New_Workspace_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicuser.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotPublicUser","json:cucumber.json"},
	   tags={
		"~@SignupPublicUser",
        "~@LoginUsingRegUsers",
         "~@PurchaseCredit",
    //  "~@LoginPublicUser",
	    "~@NewMsg",
      "~@NewPhoto",
	    "~@Inbox",
      "~@Archived",
        "~@SortInbox",
	   "~@SortSentItems",
	   "~@FindInmate",
	   "~@SortFindtheInmate",
   //  "~@SortMyContacts"
  
    
	   
	   

})


public class RunPublicUser {

}	