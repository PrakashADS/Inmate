package RUN_Kiosk2PublicDefenderAdmin;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicdefenderAdmin.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/Runp4","json:cucumber.json"},
	   tags={
  //  "~@Login",
	//     "~@GrievancesInitiate",
	   
//ASSIGNING STAFF// 
// "~@RequestSearchAssignStaff",
 	  
 //    "~@CreateNewMsg", 
  //         "~@SearchMsg",
  //        "~@MsgToInmate1",
	   
    

})


public class Run_P4 { 
	
}