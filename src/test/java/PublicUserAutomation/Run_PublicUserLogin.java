package PublicUserAutomation;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicuser.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotPublicUserLogin","json:cucumber.json"},
	   tags={
	  	"~@SignupPublicUser",
	//	   "~@LoginUsingRegUsers",
			 "~@LoginPublicUser",
	        "~@NewMsg",
            "~@NewPhoto",
	         "~@Inbox",
	        "~@FindInmate",
	  //     "~@PurchaseCredit",
  
    

})
public class Run_PublicUserLogin
{
	
}