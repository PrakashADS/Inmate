package com.inmate.publicdefender;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\New_Workspace_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\facilityAdmin.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotFacilityAdmin","json:cucumber.json"},
	   tags={
		//	  "~@LoginFacilityAdmin",
			
		"~@SortingRequest",
		
		 "~@SortingInitiateMessage",
		
    	"~@CreateNewMsg1",
	   "~@SendMsg1",	
		
    
       "~@f1",				
        
      
      "~@Documents" , 
      "~@EditDocuments",
     "~@DeleteDocuments",
      "~@DocumentSort" ,	
       
       "~@LockDown",  
     "~@LockDownSorting",		
      
//     "~@inmateSearch","~@InmateMessages",
//     "~@InmatePhotos","~@InmateConnRequest",
 //   "~@inmateSort",
      
    "~@publicUserSearch",
        "~@publicUserMessages",
    "~@publicUserPhotos",		
      	   "~@PublicUserSort",
     
     "~@Messages",	
     
       "~@Photos",
      
   "~@Keyword",
      
     "~@NoticesAdd","~@NoticeUpdate",
      
       "~@Reporting",
      
      "~@Visitor","~@Admin",
      			
})


public class RunFacilityAdmin {

}
