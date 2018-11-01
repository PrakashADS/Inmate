package PublicUserAutomation;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import AdminLogin_Inmate.Dashboard_page;
import AdminLogin_Inmate.Dnd;
import AdminLogin_Inmate.Document_Page;
import AdminLogin_Inmate.Inmate;
import AdminLogin_Inmate.Keyword_Page;
import AdminLogin_Inmate.Kiosk;
import AdminLogin_Inmate.Lockdown_Page;
import AdminLogin_Inmate.Management_User_Page;
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
		pu.txtUsername.clear();
		pu.txtUsername.sendKeys(login1.get(0).get(2));
		pu.txtPassword.clear();
		pu.txtPassword.sendKeys(login1.get(1).get(2));
		pu.btnLogin.click();
}
@Then("^Goto Facility page$")
public void Facility(DataTable facility) throws Exception
{
	AdminLogin_Inmate.Facility af=new AdminLogin_Inmate.Facility(obj);
	af.Add_Facility(facility);
	af.EditFacility(facility);
    af.Sorting();
    af.Pagination();
}
@Then("^Click the Registered Users$")
public void registeredUsers() throws Exception
{
	POM_PubDefender pu=new POM_PubDefender(obj);
	Thread.sleep(3000);
	scroll2();
	Thread.sleep(3000);
	pu.RegisteredUsers.click();
	Thread.sleep(2000);
	pu.btnSearch.click();
	Thread.sleep(2000);
	/*List<WebElement> regUsers=obj.findElements(By.xpath("//*[@id='lblUserName']"));
	Thread.sleep(1000);
	regUsers.get(1).click();*/
	scroll250();
	Thread.sleep(1000);
	obj.findElement(By.xpath("//*[contains(text(),'Jenkkins')]")).click();
	Thread.sleep(2000);
/*	scroll2();
	
	
		if(pu.ActivateUsers.isDisplayed())
		{
			Thread.sleep(1000);
			pu.ActivateUsers.click();
			Thread.sleep(1000);
			NoYes();
			Thread.sleep(1500);
		}*/
	scroll250();
	Thread.sleep(2000);
	obj.findElement(By.id("ContentPlaceHolder1_btnUpdateUserCurrentStatus")).click();
	Thread.sleep(2000);
	Select status=new Select(obj.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlCurrentStatus']")));
	status.selectByValue("1");
	Thread.sleep(1000);
	obj.findElement(By.id("ContentPlaceHolder1_btnUpdateUserCurrentStatus")).click();
	Thread.sleep(1000);
	obj.findElement(By.id("btnOk")).click();
	Thread.sleep(1000);
	boolean isAvailable=obj.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkbtnViewAsPublicUser']")).isDisplayed();
	if(isAvailable==true)
	{
		obj.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkbtnViewAsPublicUser']")).click();
		Thread.sleep(3000);
		 obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = obj.findElement(By.xpath("//*[@id='achrMyContacts']"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
	//	obj.findElement(By.xpath("//*[@id='ContentPlaceHolder1_defaultOpen']")).click();
		Thread.sleep(1000);
		//obj.findElement(By.xpath("//*[contains(text(),'Jenkkins')]")).click();
	}
	else{
		System.out.println("Not foundddd");
	}

}
@Then("^Goto Management users and Add Users$")
public void MgmtUsers(DataTable mgmtUser) throws Exception
{
	/*POM_AdminLogin pa=new POM_AdminLogin(obj);
	Thread.sleep(1000);
	pa.ManagementUser.click();
	Thread.sleep(1000);
	Select facCode=new Select(pa.FacilityCodes);
	facCode.selectByVisibleText("2411fac");
	Thread.sleep(2500);
	pa.AddUsers.click();
	Thread.sleep(1000);
	pa.Add_users(mgmtUser);*/
	Management_User_Page mu = new Management_User_Page(obj);
	mu.Mgmt_user_Add_Facilityadmin("mangaiadm","priyat","mangaiadma"+Math.random(),"mangai123");
	mu.Mgmt_user_Edit_facilityadmin();
	mu.Add_Facility_Staff("staffhlo"+Math.random(),"staff1@fac.com"+Math.random());
	mu.Mgmt_user_Edit_facilityStaff();
//	mu.Sorting();
	/*mu.Add_public_defender_admin();
	mu.Edit_public_defender_admin();
	mu.Add_public_defender_staff();
	mu.Edit_public_defender_staff();
	mu.Add_super_admin();
	mu.Edit_super_admin();
	mu.pagination();*/
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
//	obj.findElement(By.xpath("//*[@id='rptUser_menuAnchor_3']")).click();
	
}

@Then("^Goto Documents Page$")
public void Documents() throws Exception
{
	Thread.sleep(1000);
	Document_Page doc=new Document_Page(obj);
//	doc.Upload_doc_add();
//	doc.sort_document();
//	doc.ClickPdf();
//	doc.DeleteAction();
	Thread.sleep(3000);
	obj.findElement(By.xpath("//*[@id='rptUser_menuAnchor_4']")).click();
	Thread.sleep(1000);
	Select sel = new Select(obj.findElement(By.id("ddlFacilityCodes")));
	sel.selectByValue("105");
	doc.Pagination_Document();
}

@Then("^Goto LockDown page$")
public void LockDown() throws Exception
{
	Thread.sleep(1000);
	Lockdown_Page lp=new Lockdown_Page(obj);
	lp.lockdown();
	lp.Sorting();

}
@Then("^Goto Revenue Report page$")
public void Revenue_report() throws InterruptedException
{
	Thread.sleep(1000);
	Revenue_Report rr=new Revenue_Report(obj);
	rr.report_facility_daily();
	rr.report_all_daily();
	Thread.sleep(1000);
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
	ki.sorting_kiosk();
	ki.pagination();
}
@Then("^Goto Inmate page$")
public void Inmate_page(DataTable msgReport) throws Exception 
{
	Inmate in=new Inmate(obj);
	Thread.sleep(2000);			
	obj.findElement(By.id("rptUser_menuAnchor_9")).click();
	Thread.sleep(2000);
	Select sel = new Select(obj.findElement(By.id("ddlFacilityCodes")));
	sel.selectByValue("105");
	Thread.sleep(2000);			
	obj.findElement(By.id("ContentPlaceHolder1_txtInmateIDSearch")).sendKeys("11");
	Thread.sleep(2000);
	obj.findElement(By.id("btnSearch")).click();
	Thread.sleep(1500);	
	int y=1;
	switch(y)
	{
	case 1:
		
		for(int i=0;i<1;i++)
		{
		Thread.sleep(1000);
		List<WebElement> OnOff=obj.findElements(By.xpath("//*[@id='ContentPlaceHolder1_rptInmates_imgEnableDisable_"+i+"']"));
		String onOffValue=OnOff.get(i).getAttribute("src");
		String Activ="../Images/kactive.png";
		String inActiv="../Images/kinactive.png";
		if(OnOff.contains(Activ))
		{
			System.out.println("Already in Active");
		}
		else{
			Thread.sleep(1000);
			OnOff.get(0).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='btnOk']")).click();
		}
		}
	}
//	in.Edit_Inmate(msgReport);
//	in.messages_Inmate();
	in.photos_Inmate();
//	in.free_credit();
//	in.ConnectionReq();
//	in.Reports(msgReport);
}

@Then("^Goto Public user page$")
public void Public_user(DataTable puReport) throws Exception
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
	mp.message();
	mp.messages(Msgs);
	mp.sort_message();
	mp.scroll400();
	mp.Pagination();
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
	//kp.keyword_add();
	kp.keyword_edit();
	kp.keyword_sorting();
	kp.Scroll250();
	kp.Pagination();
}

@Then("^Goto Notice page$")
public void Noticepage(DataTable notices) throws Exception
{
	Notice_Page np=new Notice_Page(obj);
	//  np.Add_Notice();
	
	  np.Add_Notices(notices);
	  np.sort_notice();
	  np.edit_Notices(notices);
	  np.ScrollUp250();
	  np.pagination();
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
	dn.sorting();
	dn.ScrollUp250();
	dn.pagination();
	dn.ScrollUp250();
	dn.TwilioDND_sort();
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
public void AfterTest(Scenario scenario) throws IOException
  {
	   if(scenario.isFailed()) 
	   {	   
	   Screenshot();
	   }   
  }
public String Screenshot() throws IOException {   

/*   String timeStamp;
	 String ClassName=getClass().getName();
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime()); 
	 FileUtils.copyFile(scrFile, new File("C:\\Users\\prakashd\\New_Workspace_Automation\\Chif\\Screenshots_Chif\\"+ClassName+"_"+timeStamp+".png"));
	 }
*/	    String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());;
		TakesScreenshot screen = (TakesScreenshot) obj;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest ="D:\\Prakash_Automation\\Inmate\\target\\Screenshots_Failed\\"+timeStamp+".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
		
  }	
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
private void scroll2() {
	JavascriptExecutor js = (JavascriptExecutor) obj;
	js.executeScript("javascript:window.scrollBy(0,-250)");
}
}

