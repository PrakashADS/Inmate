package RUN_PublicUser2FacilityAdmin_PhotoSending;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicuser.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotPublicUser","json:cucumber.json"},
	   tags={
    //    "~@LoginPublicUser",
	     "~@NewMsg",
   //     "~@NewPhoto",
        "~@Inbox",
        "~@FindInmate"
  

})


public class RunPublicUser {

}	