package PublicUserAutomation;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="C:\\Users\\prakashd\\New_Workspace_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\AdminUser.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotAdminLogin2","json:cucumber.json"},
	   tags={
//	   "~@Login",
	       "~@Facility",
	       "~@MgmtUsers",
		   "~@RegUsers",
	      "~@RegisteredUsers",
		  "~@Dashboard",
		  "~@Documents",
		  "~@LockDown",
	     "~@RevenueReport",
	     "~@Pod",
         "~@Inmate",
         "~@Kiosks",
       "~@Publicusers",
	//    "~@GrievancesRequest",
	      "~@Messages",
	   "~@Photos",
	   "~@Keywords",
      "~@Notices",
     "~@Reporting",
     "~@DndUsers"
	
})
public class Run_Admin_Login
{
	
}