package RUNKioskFacilityAdminf1;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\facilityAdmin.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotFacilityAdmin","json:cucumber.json"},
	   tags={
		/*  "~@LoginFacilityAdmin",*/
		
		"~@CreateNewMsg1",
	    "~@SendMsg1",	
		
    
	    //     "~@f1",
        
       
        "~@Documents" ,
       "~@EditDocuments",
      "~@DeleteDocuments",
      
       "~@LockDown",  
      
     "~@inmateSearch","~@InmateMessages","~@InmatePhotos","~@InmateConnRequest",
      
     "~@publicUserSearch","~@publicUserMessages","~@publicUserPhotos",
      
      "~@Messages",
     
      "~@Photos",
     
    "~@Keyword",
      
     "~@NoticesAdd","~@NoticeUpdate",
      
      "~@Reporting",
      
      "~@Visitor","~@Admin",

})


public class RunF01 {

}
