package RUN_Kiosk2PublicDefenderStaff;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicStaff.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/Run_ps1","json:cucumber.json"},
	   tags={
  //    "~@LoginPubStaff",
  //	 "~@RequestSearch",
  //    "~@ReplyTxtPdfBoth",
						
	 "~@InitiateMsg",
      "~@createNew",
	 "~@SearchMsgs",   
     "~@MsgToInmates1",
  
    

})


public class Run_PS1 { 
	
}		