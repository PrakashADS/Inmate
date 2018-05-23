package Run_KioskFacilityAdmin;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\kiosk\\kiosk.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotKiosk","json:cucumber.json"},
	   tags={
		
      //    "~@LoginPage",
		
		 "~@LoginPage1",
          
 //     "~@RequestsPage",
		
		  "~@MyContacts",
		
		 "~@f1",
			
		 "~@f1Reply",
		 
		 "~@Visitors",
		 
		 "~@PdForm",
		 
		 "~@ReplyPdForm",
		 
		 "~@Messages",
		 
		 "~@Photos"
		 
	
  

})
public class Run_FAK2 { 
	
}