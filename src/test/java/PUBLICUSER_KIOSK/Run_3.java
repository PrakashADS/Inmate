package PUBLICUSER_KIOSK;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="D:\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\publicuser.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotPublicUser3","json:cucumber.json"},
	   tags={
    //    "~@LoginPublicUser",
	     "~@NewMsg",
   //     "~@NewPhoto",
        "~@Inbox",
        "~@FindInmate",
  

})


public class Run_3 {

}	