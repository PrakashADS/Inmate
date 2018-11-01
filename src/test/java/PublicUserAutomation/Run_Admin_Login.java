package PublicUserAutomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features="D:\\Prakash_Automation\\Inmate\\src\\test\\java\\com\\inmate\\publicdefender\\AdminUser.feature",
    		 	      		
			   plugin = {"pretty", "html:target/cucumber-html-report/ScreenshotAdminLoginNew",
		      "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Inmate_PublicUserReportOct24.html","json:cucumber.json"},
	   tags={
		
	//    "~@Login",
	      "~@Facility",
          "~@MgmtUsers",
          "~@RegUsers",
          "~@RegisteredUsers",
	 	  "~@Dashboard",	
          "~@Documents",
	      "~@LockDown",
	      "~@RevenueReport",
	      "~@Pod",	
	      "~@Kiosks",
	   // "~@Inmate",		
	      "~@Publicusers",
	      "~@GrievancesRequest",
	      "~@Messages",
          "~@Photos",	
	      "~@Keywords",
	      "~@Notices",
	      "~@Reporting",
	      "~@DndUsers"  		     
})
public class Run_Admin_Login
{
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(
				"D:\\Prakash_Automation\\Inmate\\src\\test\\java\\config\\test.xml"));
		    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		    String timeStamp=new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime()); 
		Reporter.addScreenCaptureFromPath("D:\\Prakash_Automation\\Inmate\\target\\Screenshots_Failed\\"+timeStamp+".png"); 
}}