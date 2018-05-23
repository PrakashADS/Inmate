package PublicUserAutomation;
import java.awt.AWTException;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import AdminLogin_Inmate.Dashboard_page;
import AdminLogin_Inmate.Dnd;
import AdminLogin_Inmate.Document_Page;
import AdminLogin_Inmate.Inmate;
import AdminLogin_Inmate.Keyword_Page;
import AdminLogin_Inmate.Kiosk;
import AdminLogin_Inmate.Lockdown_Page;
import AdminLogin_Inmate.Message_Page;
import AdminLogin_Inmate.Notice_Page;
import AdminLogin_Inmate.Photo_Page;
import AdminLogin_Inmate.Pod;
import AdminLogin_Inmate.Publicuser_Page;
import AdminLogin_Inmate.Registered_Users_Page;
import AdminLogin_Inmate.Reporting;
import AdminLogin_Inmate.Request_Page;
import AdminLogin_Inmate.Revenue_Report;
import PageObjectModel.POM_PubDefender;

import com.inmate.publicdefender.PublicDefender;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLogin {
	
	private static WebDriver obj;
public AdminLogin()
{
	this.obj=obj;
}
public WebDriver getDriver()
{
	return this.obj;
}
@When("^Enter userName and passWord to LogIn AdminUser$")
public void AdminLogin_page(DataTable login) throws InterruptedException
{
		List<List<String>> login1=login.raw();
		POM_PubDefender pu=new POM_PubDefender(obj);
		pu.btnLogin.click();
		pu.txtUsername.sendKeys(login1.get(0).get(1));
		pu.btnLogin.click();
		pu.txtPassword.sendKeys(login1.get(1).get(1));
		pu.btnLogin.click();
}
@Then("^Goto Facility page$")
public void Facility(DataTable facility) throws Exception
{
	AdminLogin_Inmate.Facility af=new AdminLogin_Inmate.Facility(obj);
	af.Add_Facility(facility);
	af.EditFacility(facility);
}
@Then("^Click the Registered Users$")
public void registeredUsers() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(2000);
	pu.RegisteredUsers.click();
	Thread.sleep(2000);
	pu.btnSearch.click();
	Thread.sleep(2000);
	List<WebElement> regUsers=obj.findElements(By.xpath("//*[@id='lblUserName']"));
	Thread.sleep(1000);
	regUsers.get(1).click();
	Thread.sleep(1000);
	try {
		if(pu.ActivateUsers.isDisplayed())
		{
			Thread.sleep(1000);
			pu.ActivateUsers.click();
			Thread.sleep(1000);
			NoYes();
			Thread.sleep(1500);
			
		}
		else
		{
			System.out.println("No elements found...");
		}
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	scroll250();
	Thread.sleep(1000);
	obj.findElement(By.id("ContentPlaceHolder1_btnUpdateUserCurrentStatus")).click();
	Thread.sleep(2000);
	Select status=new Select(obj.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCurrentStatus']")));
	status.selectByValue("1");
	Thread.sleep(1000);
	obj.findElement(By.id("ContentPlaceHolder1_btnUpdateUserCurrentStatus")).click();
	Thread.sleep(1000);
	obj.findElement(By.id("btnOk")).click();
	
}
@Then("^Goto Management users and Add Users$")
public void MgmtUsers(DataTable mgmtUser) throws InterruptedException
{
	POM_AdminLogin pa=new POM_AdminLogin(obj);
	Thread.sleep(1000);
	pa.ManagementUser.click();
	Thread.sleep(1000);
	Select facCode=new Select(pa.FacilityCodes);
	facCode.selectByVisibleText("2411fac");
	Thread.sleep(2500);
	pa.AddUsers.click();
	Thread.sleep(1000);
	pa.Add_users(mgmtUser);
}
@Then("^Goto Registered users$")
public void reg_Users() throws Exception
{
	Thread.sleep(1000);
	Registered_Users_Page ru=new Registered_Users_Page(obj);
	ru.Registered_user();
//	ru.field_sorting();
}

@Then("^Goto Dashboard$")
public void Dashboard() throws Exception
{
	Thread.sleep(1000);
	Dashboard_page dp=new Dashboard_page(obj);
	dp.Dashboard();
	
}

@Then("^Goto Documents Page$")
public void Documents() throws Exception
{
	Thread.sleep(1000);
	Document_Page doc=new Document_Page(obj);
	doc.Upload_doc_add();
	doc.sort_document();
	
}

@Then("^Goto LockDown page$")
public void LockDown() throws Exception
{
	Thread.sleep(1000);
	Lockdown_Page lp=new Lockdown_Page(obj);
	lp.lockdown();
}
@Then("^Goto Revenue Report page$")
public void Revenue_report() throws InterruptedException
{
	Thread.sleep(1000);
	Revenue_Report rr=new Revenue_Report(obj);
//	rr.report_facility_daily();
	//rr.report_all_daily();
	rr.report_all_monthly();
	rr.report_facility_monthly();
}

@Then("^Goto POD page$")
public void Pod() throws Exception
{
	Pod pd=new Pod(obj);
	pd.Add_Pod();
	pd.Edit_Pod();
	pd.sort_pod();
}

@Then("^Goto Kiosk page$")
public void Kiosks() throws InterruptedException
{
	Kiosk ki=new Kiosk(obj);
	ki.Add_kiosk();
	ki.Edit_kiosk();
}
@Then("^Goto Inmate page$")
public void Inmate_page(DataTable msgReport) throws Exception 
{
	Inmate in=new Inmate(obj);
	in.Edit_Inmate(msgReport);
	in.messages_Inmate();
	in.photos_Inmate();
	in.free_credit();
	in.ConnectionReq();
	in.Reports(msgReport);
}

@Then("^Goto Public user page$")
public void Public_user(DataTable puReport) throws InterruptedException, AWTException
{
    Publicuser_Page pp=new Publicuser_Page(obj);
	pp.publicuser_edit(puReport);

}
@Then("^Goto Grievances and Requests page$")
public void Grievances() throws Exception
{
	Thread.sleep(1000);
	Request_Page rp=new Request_Page(obj);
	rp.request();
	rp.Request_Sort();
	rp.Initiate_msg_to_inmate();
}
@Then("^Goto Messages page$")
public void Messages(DataTable Msgs) throws Exception
{
	Thread.sleep(1000);
	Message_Page mp=new Message_Page(obj);
//	mp.message();
	mp.messages(Msgs);
	mp.sort_message();
}

@Then("^Goto Photos$")
public void Photos(DataTable photo) throws InterruptedException
{
	Thread.sleep(1000);
	Photo_Page pp=new Photo_Page(obj);
	pp.Edit_photo(photo);
}

@Then("^Goto keywords page$")
public void KeyWords(DataTable Keywords) throws Exception
{
	Keyword_Page kp=new Keyword_Page(obj);
	kp.keyword_add();
	kp.keyword_edit();
	kp.keyword_sorting();
}

@Then("^Goto Notice page$")
public void Noticepage(DataTable notices) throws Exception
{
	Notice_Page np=new Notice_Page(obj);
	//  np.Add_Notice();
	  np.Add_Notices(notices);
	  np.sort_notice();
	//PublicDefender pd=new PublicDefender(obj);
	//pd.Notices(notices);
}

@Then("^Goto Reporting page and Sort$")
public void Reporting_Page() throws InterruptedException
{
	Thread.sleep(1000);
	Reporting re = new Reporting(obj);  
	re.report();
}
@Then("^Goto DND users and Add$")
public void DNDUsers() throws Exception
{
	Dnd dn = new Dnd(obj);
	dn.dnd_users();
}
@BeforeMethod
@Given("^Enter the Inmate Admin URL$")
public void beforeMethod() {
	  PropertyConfigurator.configure("C:\\Users\\prakashd\\Prakash_Automation\\Inmate\\log4j.properties");

	  System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver.exe");  
	  obj=new ChromeDriver();
	   obj.get("http://inmatecr01.sgssys.info/facilityuser");
	   obj.manage().window().maximize();
	   obj.manage().logs().getClass();
	   obj.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS); 
	 
	  }


@After
 public void Screenshot(Scenario scenario) {  
     if (scenario.isFailed()) {  
         try {  
       	  scenario.write("Current Page URL is " + obj.getCurrentUrl());
             byte[] screenshot = ((TakesScreenshot) obj).getScreenshotAs(OutputType.BYTES); 
             
             scenario.embed(screenshot, "image/png");  
         } catch (WebDriverException wde) {  
             System.err.println(wde.getMessage());  
         } catch (ClassCastException cce) {  
             cce.printStackTrace();  
         }  
     }}
public void YesNoo() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	 int YesNo=1;
		switch(YesNo)
		{
		case 1:
			Thread.sleep(2000);
			obj.findElement(By.id("btnYes")).click();
			Thread.sleep(1000);
			pu.btnOk.click();		
			break;
		case 2:
			Thread.sleep(2000);
			obj.findElement(By.id("btnNo")).click();
			break;
		}	}
public void NoYes() throws InterruptedException
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	 int YesNo=1;
		switch(YesNo)
		{
		case 1:
			Thread.sleep(2000);
			obj.findElement(By.id("btnYes")).click();
			Thread.sleep(1000);
			pu.btnOk.click();		
			break;
		case 2:
			Thread.sleep(2000);
			obj.findElement(By.id("btnNo")).click();
			break;
		}	}
private void scroll250() {
	JavascriptExecutor js = (JavascriptExecutor) obj;
	js.executeScript("javascript:window.scrollBy(0,250)");
}
}

