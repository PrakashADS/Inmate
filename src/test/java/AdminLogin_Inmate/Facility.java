package AdminLogin_Inmate;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.tools.ant.util.optional.NoExitSecurityManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import utility.Configure;
//import utility.Log;
//import utility.ReadExcel;



import PageObjectModel.POM_PubDefender;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import cucumber.api.DataTable;

public class Facility   {
	public  WebDriver driver;
	public Facility(WebDriver driver)
	{
		this.driver=driver;
	}
	public static Logger logger=Logger.getLogger("Login_Page");
	//PropertyConfigurator.configure("log4j.properties");
	int randomInt;
	int randomInt2;
	int randomInt3;
	int randomInt4;
	int randomInt6;
	By btn_Addfacility = By.xpath("//*[@id='ContentPlaceHolder1_bnAddFacility']");
	By txt_code = By.xpath("//*[@id='ContentPlaceHolder1_txtFacilityCode']");
	By txt_name = By.xpath("//*[@id='ContentPlaceHolder1_txtFacilityName']");
	By txt_email =By.xpath("//*[@id='ContentPlaceHolder1_txtEmail']");
	By txt_phone = By.xpath("//*[@id='ContentPlaceHolder1_txtPhone']");
	By txt_address = By.xpath("//*[@id='ContentPlaceHolder1_txtAddress1']");
	//By dropdown_state = By.xpath(".//*[@id='ContentPlaceHolder1_txtAddress1']");
	By btn_browse = By.xpath("//*[@id='ContentPlaceHolder1_fluFormLogo']");
	By btn_upload = By.xpath("//*[@id='ContentPlaceHolder1_btnUploadLogo']");
	By chk_message = By.xpath("//*[@id='ContentPlaceHolder1_chkMessageAccess']"); 	 	
	By chk_document = By.xpath("//*[@id='ContentPlaceHolder1_chkDocumentAccess']");
	By chk_photo = By.xpath("//*[@id='ContentPlaceHolder1_chkPhotoAccess']");
	By chk_request = By.xpath("//*[@id='ContentPlaceHolder1_chkFormRequestAccess']");
	By chk_commissary = By.id("ContentPlaceHolder1_chkCommissaryAccess");
	By chk_lawlibrary = By.xpath("//*[@id='ContentPlaceHolder1_chkLawLibraryAccess']");
	By dwn_visitor = By.xpath("//*[@id='ContentPlaceHolder1_cblAvailableForms_0']");
	By dwn_admin = By.xpath("//*[@id='ContentPlaceHolder1_cblAvailableForms_1']");
	By dwn_request = By.xpath("//*[@id='ContentPlaceHolder1_cblAvailableForms_2']");
	By btn_Addform = By.name("ctl00$ContentPlaceHolder1$btnAddForms");
	By btn_ok =By.id("btnOk");
	By txt_server_url =By.xpath("//*[@id='ContentPlaceHolder1_txtFTPServerURL']");
	By txt_username = By.xpath("//*[@id='ContentPlaceHolder1_txtFTPUsername']");
	By txt_filepath = By.xpath("//*[@id='ContentPlaceHolder1_txtFTPFilePath']");
	By txt_password = By.xpath("//*[@id='ContentPlaceHolder1_txtFTPPassword']");
	By btn_save = By.xpath("//*[@id='btnSubmit']");
	By btn_alert =By.name("ctl00$ContentPlaceHolder1$uctlMessage$btnOk");
	By txt_visitor = By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl02$txtFacilityRequestFormTitle");
	By txt_pd = By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl03$txtFacilityRequestFormTitle");
	By txt_admin = By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl04$txtFacilityRequestFormTitle");
	By dwn_frequency_count1 = By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyCount_1");
	By dwn_frequency_type1 = By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyType_1");
	By dwn_freq_count2 = By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl04$ddlFrequencyCount");
	By dwn_frequency_type2 = By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl04$ddlFrequencyType");
	By chk_Active1 = By.id("ContentPlaceHolder1_rblForm1_0");
	By chk_Active2 = By.id("ContentPlaceHolder1_rblForm2_0");
	By chk_Active3 = By.id("ContentPlaceHolder1_rblForm3_0");
	By txt_lawlibrary = By.id("ContentPlaceHolder1_txtLawLibraryUrl");
	By txt_commissary = By.id("ContentPlaceHolder1_txtCommisaryUrl");
	By edit_fac = By.xpath("//*[@id='lnkFacilityID']");
	By pagination = By.xpath("//*[@id='grvFacility']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");                
										
	By btn_update = By.name("ctl00$ContentPlaceHolder1$btnSubmit");
	By btn_popup = By.name("ctl00$ContentPlaceHolder1$uctlMessage$btnOk");
	By menu_facility = By.xpath("//*[@id=rptUser_menuAnchor_0]");
	By bt_reset = By.name("ctl00$ContentPlaceHolder1$btnReset");
	By lnk_Export_to_excel  = By.name("ctl00$ContentPlaceHolder1$imbtnExportToExcel");
	By btn_form_yes = By.id("btnYes");
	By Chk_msg_to_inmate1 = By.id("ContentPlaceHolder1_cblManagementAvailableForms_0");
	By chk_msg_to_inmate2 = By.id("ContentPlaceHolder1_cblManagementAvailableForms_1");
	By chk_msg_to_inmate3 = By.id("ContentPlaceHolder1_cblAvailableForms_3");
	By btn_add_form = By.id("ContentPlaceHolder1_btnAddForms");
	By txt_admin_form = By.id("ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_2");
	By txt_msg_to_inmate1 = By.id("ContentPlaceHolder1_gdvwManagementForm_txtFacilityManagementRequestFormTitle_0");
	By txt_msg_to_inmate2 = By.id("ContentPlaceHolder1_gdvwManagementForm_txtFacilityManagementRequestFormTitle_1");
	By txt_req_form = By.id("ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_3");
	//By sort_code = By.xpath("//*[@id='grvFacility']/tbody/tr[1]/th[1]/a");
	By sort_code = By.linkText("Code");
	//*[@id="grvFacility"]/tbody/tr[1]/th[1]/a
	By sort_name = By.xpath("//*[@id='grvFacility']/tbody/tr[1]/th[2]/a");
	By sort_city = By.xpath("//*[@id='grvFacility']/tbody/tr[1]/th[3]/a");
	By sort_state = By.xpath("//*[@id='grvFacility']/tbody/tr[1]/th[4]/a");
	By sort_status = By.xpath("//*[@id='grvFacility']/tbody/tr[1]/th[5]/a");
	By sort_lnk_code = By.id("lnkFacilityID");
	By sort_lnk_name = By.id("lblFacilityDescription");
	By sort_lnk_city = By.xpath("//*[@id='grvFacility']/tbody/tr[2]/td[3]");
	By sort_lnk_state = By.id("lblState");
	By sort_lnk_status = By.id("imgStatus");
	By button_reset = By.id("ContentPlaceHolder1_btnReset");


	/* Add Facility */
	public void Add_Facility(DataTable facility) throws Exception{
		try {

			List<List<String>>fac=facility.raw();
			Thread.sleep(2000);
			driver.findElement(btn_Addfacility).click();
			logger.info("Add Facility has been chosen");	
			Thread.sleep(4000);			
			scroll();
			scroll();
			Thread.sleep(2000);
			driver.findElement(btn_save).click();
			scroll();
			Thread.sleep(2000);
			Random rd=new Random();
			
			for(int i=100;i<1000;i++)
			{
				randomInt=rd.nextInt(1001);
			}
			driver.findElement(txt_code).sendKeys(fac.get(0).get(1)+randomInt);
			Thread.sleep(1000);	
			/*scroll();
			Thread.sleep(2000);
			driver.findElement(btn_save).click();			
			scroll();
			Thread.sleep(2000);		*/
            Random rd1=new Random();
			
			for(int i=100;i<1000;i++)
			{
				randomInt2=rd1.nextInt(1001);
			}
			driver.findElement(txt_name).sendKeys(fac.get(1).get(1)+randomInt2);
			logger.info("Facility Name has been entered");
			Thread.sleep(1000);	
			/*scroll();
			Thread.sleep(2000);
			driver.findElement(btn_browse).sendKeys("");
			Thread.sleep(1000);
			scroll();
			Thread.sleep(2000);
			driver.findElement(btn_save).click();
			Thread.sleep(1000);*/
			driver.findElement(btn_browse).sendKeys("C:\\Users\\prakashd\\Desktop\\thumb-up-sign_318-63754.jpg");
			logger.info("Logo chosen successfully");
			Thread.sleep(1000);	
			/*scroll();
			Thread.sleep(2000);
			driver.findElement(btn_save).click();
			Thread.sleep(1000);	*/
			driver.findElement(btn_upload).click();
			logger.info("Upload button chosen successfully");
			/*scroll();
			Thread.sleep(2000);
			driver.findElement(btn_save).click();	*/
			Random rd3 = new Random();
			for (int x = 100; x <= 1000; ++x) {
				randomInt3 = rd3.nextInt(1001);		
			}

			driver.findElement(txt_email).sendKeys(fac.get(2).get(1)+randomInt3+fac.get(2).get(2)); 
			logger.info("Email has been entered");	
			
			driver.findElement(txt_phone).sendKeys(fac.get(3).get(1));
			logger.info("Phone number has been entered");
		
			Thread.sleep(1000);	
			driver.findElement(txt_address).sendKeys(fac.get(4).get(1));
			logger.info("Facility address has been entered");
			/*scroll();
			Thread.sleep(2000);*/
			Thread.sleep(1000);
			driver.findElement(By.id("ContentPlaceHolder1_txtCity")).sendKeys(fac.get(5).get(1));
			Thread.sleep(1000);
			Select state = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlState")));
			state.selectByVisibleText(fac.get(6).get(1));
			logger.info("State has chosen");
			Thread.sleep(1000);	
			driver.findElement(By.id("ContentPlaceHolder1_txtZipCode")).sendKeys(fac.get(7).get(1));
			Thread.sleep(1500);
			scroll250();
			driver.findElement(chk_message).click();
			logger.info("Message checkbox chosen successfully");
			Thread.sleep(1000);		
			driver.findElement(chk_document).click();
			logger.info("Document checkbox chosen successfully");
			Thread.sleep(1000);		
			driver.findElement(chk_photo).click();
			logger.info("Photo checkbox chosen successfully");
			Thread.sleep(1000);		
			driver.findElement(chk_request).click();
			logger.info("Request checkbox chosen successfully");
			Thread.sleep(1000);
			driver.findElement(chk_commissary).click();
			logger.info("Commissary checkbox chosen successfully");
			Thread.sleep(2000);		
			driver.findElement(txt_commissary).sendKeys(fac.get(8).get(1));
			logger.info("Commissary textbox entered successfully");
			Thread.sleep(1500);
			driver.findElement(chk_lawlibrary).click();
			logger.info("Lawlibrary checkbox chosen successfully");
			Thread.sleep(1000);	
			driver.findElement(txt_lawlibrary).sendKeys(fac.get(9).get(1));
			logger.info("Law library textbox entered successfully");
			Thread.sleep(1500);
			driver.findElement(By.id("ContentPlaceHolder1_chkFreeCredits")).click();
//			driver.findElement(dwn_visitor).click();
//			logger.info("Visitor checkbox chosen successfully");
//			Thread.sleep(1000);			
//			driver.findElement(dwn_admin).click();
//			logger.info("Admin checkbox chosen successfully");
//			Thread.sleep(1000);	
//			driver.findElement(dwn_request).click();
//			logger.info("Request checkbox chosen successfully");						
			//webdriverWait(btn_Addform, 50);	
			Thread.sleep(2500);
			Select freq=new Select(driver.findElement(By.id("ddlCreditFrequency")));
			freq.selectByValue("2");
			Thread.sleep(1000);
			Select cred=new Select(driver.findElement(By.id("ddlFreeCredits")));
			cred.selectByValue("2");
			Thread.sleep(1000);
			List<WebElement> chk=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rblFacilityStatus"));
			Boolean isSelected=chk.get(0).isSelected();
			
				if(isSelected=true)
				{
					chk.get(0).click();
				}
				else{
					chk.get(1).click();
				}
			    Thread.sleep(1500);
			    driver.findElement(By.id("ContentPlaceHolder1_chkInvitePublicUser")).click();
			    Thread.sleep(1500);
			    scroll250();
			    Thread.sleep(1500);
				Select frequency=new Select(driver.findElement(By.id("ddlFrequencyType")));
				frequency.selectByValue("2");
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_txtFrequencyLimits")).sendKeys(fac.get(10).get(1));
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_txtLimitsPerSource")).sendKeys(fac.get(11).get(1));
				Thread.sleep(1000);
				List<WebElement> chk1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdoInvitePublicUserStatus"));
			
					Boolean isSelected1;
					try {
						isSelected1 = chk.get(0).isSelected();
					} catch (StaleElementReferenceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						if(isSelected1=true)
						{
							chk1.get(0).click();
						}
						else{
							chk1.get(1).click();
						}
				
					Thread.sleep(2000);
					scroll350();
					/*driver.findElement(By.id("ContentPlaceHolder1_txtLawLibraryUrl")).sendKeys("http://inmatecr01.sgssys.info/Admin/AddFacility.aspx");
					Thread.sleep(1000);
					driver.findElement(By.id("ContentPlaceHolder1_txtCommisaryUrl")).sendKeys("http://inmatecr01.sgssys.info/Admin/AddFacility.aspx");
					Thread.sleep(1000);*/
					Thread.sleep(2000);
				
					driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_0")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_1")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_2")).click();
					Thread.sleep(1500);
					driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_3")).click();
					Thread.sleep(1500);
					driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_4")).click();
					Thread.sleep(1500);
					driver.findElement(By.id("ContentPlaceHolder1_cblManagementAvailableForms_0")).click();
					Thread.sleep(1500);
			driver.findElement(btn_Addform).click();
			Thread.sleep(2000);					
			YesNoo();
			Thread.sleep(1500);
		
			VisitorReqForm(facility);
			
			PublicDefForm(facility);
			
			PDS(facility);
			
			RemedyForm(facility);
			
			ReqForm1(facility);
			scroll250();
			MsgToInmateForm1(facility);
			
			Thread.sleep(2000);
			driver.findElement(txt_server_url).sendKeys(fac.get(12).get(1));
			logger.info("Server url has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_filepath).sendKeys("111222333");
			driver.findElement(btn_save).click();
			driver.findElement(txt_filepath).clear();
			Random rd4 = new Random();
			for (int x = 1111; x <=9998; ++x) {
				randomInt4 = rd4.nextInt(9999);		
			}
			Thread.sleep(1000);
			driver.findElement(txt_filepath).sendKeys(fac.get(13).get(1)+randomInt4+".txt");
			logger.info("File path has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_username).sendKeys(fac.get(14).get(1));
			logger.info("Username has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_password).sendKeys(fac.get(15).get(1));
			logger.info("Password has been entered");
			Thread.sleep(2000);	
			LockIndividualKiosk(facility);
			/*driver.findElement(txt_visitor).sendKeys("visitor form");
			logger.info("Visitor form has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_pd).sendKeys("pd form");
			logger.info("Request form has been entered");
			Thread.sleep(1000);	
			
			
			
			
			
		//	driver.findElement(btn_ok).click();
			logger.info("Ok button has been clicked");
			driver.findElement(txt_admin).sendKeys("Administrative Remedy form");
			logger.info("Remedy form has been entered");
			Thread.sleep(1000);
			Select freqcount1 = new Select(driver.findElement(dwn_frequency_count1));
			freqcount1.selectByIndex(2);
			logger.info("Freq count has been entered");
			Select freqtype1 = new Select(driver.findElement(dwn_frequency_type1));
			freqtype1.selectByIndex(1);
			logger.info("Freq type has been entered");
			Select freqcount2 = new Select(driver.findElement(dwn_freq_count2));
			freqcount2.selectByIndex(5);
			logger.info("Freq count has been entered");	
			Select freqtype2 = new Select(driver.findElement(dwn_frequency_type2));
			freqtype2.selectByIndex(2);
			driver.findElement(txt_msg_to_inmate1).sendKeys("Message to inmate1");
			logger.info("Form title1 has been entered");
			driver.findElement(txt_msg_to_inmate2).sendKeys("Message to inmate2");
			logger.info("Form title2 has been entered");
			Thread.sleep(2000);
			scroll();
			Thread.sleep(1000);
			driver.findElement(txt_server_url).sendKeys("192.168.10.27");
			logger.info("Server url has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_filepath).sendKeys("123.22222.222.22");
			driver.findElement(btn_save).click();
			driver.findElement(txt_filepath).clear();
			driver.findElement(txt_filepath).sendKeys("/Inmate/Inmate0301.txt");
			logger.info("File path has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_username).sendKeys("inmate_ftp");
			logger.info("Username has been entered");
			Thread.sleep(1000);	
			driver.findElement(txt_password).sendKeys("inmate2017");
			logger.info("Password has been entered");
			Thread.sleep(1000);	
			driver.findElement(btn_save).click();
			logger.info("save button clicked");
			Thread.sleep(1000);	
			driver.findElement(btn_ok).click();
			Thread.sleep(2000);	
			logger.info("Ok button clicked");*/				
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	/* Edit Facility */
	public void lnkFacilityID(){

		try {
			//Logger logger=Logger.getLogger("Login_Page");
		//PropertyConfigurator.configure("log4j.properties");
			//System.out.println("hiii123");
			
			driver.findElement(By.id("ContentPlaceHolder1_txtFacilityCodeSearch")).sendKeys("fac");
			Thread.sleep(2000);
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnSearch")).click();		
		
			Thread.sleep(2000);
			List<WebElement> myElements = driver.findElements(edit_fac);
			Thread.sleep(2000);
			myElements.get(0).click();
			Thread.sleep(2000);
			System.out.println("Size of List: "+myElements.size());
			driver.findElement(txt_code).clear();
			driver.findElement(txt_code).sendKeys("Tes1fac"+Math.random());
			logger.info("Code has been edited");
			Thread.sleep(2000);
			scroll();
			driver.findElement(chk_msg_to_inmate3).click();
			logger.info("Message to inmate3 has been chosen");
			Thread.sleep(2000);
			driver.findElement(btn_add_form).click();
			Thread.sleep(2000);
			driver.findElement(btn_form_yes).click();
			Thread.sleep(2000);
			driver.findElement(txt_req_form).sendKeys("Request form");
			Thread.sleep(1000);
			driver.findElement(txt_msg_to_inmate1).clear();
			Thread.sleep(2000);
			driver.findElement(txt_msg_to_inmate1).sendKeys("Message to inmate1 form");
			Thread.sleep(2000);			
			driver.findElement(btn_update).click();
			logger.info("Update button clicked");
			driver.findElement(btn_alert).click();
			Thread.sleep(2000);
			driver.findElement(bt_reset).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/* Pagination and Export to Excel */
	public void Pagination(){	
		try {
			/*Logger logger=Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");	
			//driver.findElement(menu_facility).click();*/
			
			//driver.findElement(lnk_Export_to_excel).click();
			logger.info("Export to excel link clicked successfully");
			webdriverWait(pagination, 50);
			logger.info("Navigated to list page");
			scroll();
			Thread.sleep(2000);	
			
			Thread.sleep(4000);			
			driver.findElement(pagination).click();
			logger.info("Pagination has been chosen");			
			logger.info("Before Code sorting");			
			sort_code_before();	
			Thread.sleep(2000);
			driver.findElement(sort_code).click();
			//System.out.println("sort code clicked successfully");
			logger.info("After code sorting");
			sort_code_after();
			
			logger.info("Before Name sorting");			
			sort_name_before();			
			driver.findElement(sort_name).click();
			logger.info("After Name sorting");
			sort_name_after();
			
			/*logger.info("Before City sorting");			
			//sort_city_before();			
			driver.findElement(sort_city).click();
			logger.info("After City sorting");
			sort_city_after();*/
			
			logger.info("Before State sorting");			
			sort_state_before();			
			driver.findElement(sort_state).click();
			logger.info("After State sorting");
			sort_state_after();
			
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}

	/* code for scroll */
	private void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,950)");
	}
	private void scroll250() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
	}
	private void scroll350() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,350)");
	}
	/* code for Explicit wait */
	public void webdriverWait(By locator, long sec){
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void sort_code_before() throws Exception{
		try{
		Thread.sleep(1000);
		driver.findElement(sort_code).click();
		
		Thread.sleep(2000);
		List<WebElement> sortcode = driver.findElements(sort_lnk_code);
		Thread.sleep(1000);
		for(WebElement e:sortcode){
			Thread.sleep(2000);
			System.out.println(e.getText());
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sort_code_after() throws Exception{
		try{
		Thread.sleep(1000);
		driver.findElement(sort_code).click();
		Thread.sleep(2000);
		List<WebElement> sortcode1 = driver.findElements(sort_lnk_code);
		for(WebElement e:sortcode1){
			Thread.sleep(2000);
			System.out.println(e.getText());
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void sort_name_before() throws Exception{
		try{
		Thread.sleep(1000);
		driver.findElement(sort_name).click();		
		Thread.sleep(2000);
		List<WebElement> sortname = driver.findElements(sort_lnk_name);
		for(WebElement e:sortname){
			Thread.sleep(2000);
			System.out.println(e.getText());
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sort_name_after() throws Exception{
		try{
		Thread.sleep(1000);
		driver.findElement(sort_name).click();		
		Thread.sleep(2000);
		List<WebElement> sortname = driver.findElements(sort_lnk_name);
		for(WebElement e:sortname){
			Thread.sleep(2000);
			System.out.println(e.getText());
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/*public void sort_city_before() throws Exception{
		Thread.sleep(1000);
		driver.findElement(sort_city).click();		
		webdriverWait(sort_lnk_city, 50);
		List<WebElement> sortcity = driver.findElements(sort_lnk_city);
		for(WebElement e:sortcity){
			Thread.sleep(2000);
			System.out.println(e.getText());
		}
	}*/
	
	public void sort_city_after() throws Exception{
		try {
			Thread.sleep(1000);
			driver.findElement(sort_city).click();		
			Thread.sleep(2000);
			List<WebElement> sortcity = driver.findElements(sort_lnk_city);
			for(WebElement e:sortcity){
				Thread.sleep(2000);
				System.out.println(e.getText());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void sort_state_before() throws Exception{
		try {
			Thread.sleep(2000);
			driver.findElement(sort_state).click();		
			Thread.sleep(2000);
			List<WebElement> sortstate = driver.findElements(sort_lnk_state);
			for(WebElement e:sortstate){
				Thread.sleep(2000);
				System.out.println(e.getText());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void sort_state_after() throws Exception{
		try {
			Thread.sleep(1000);
			driver.findElement(sort_state).click();		
			Thread.sleep(2000);
			List<WebElement> sortstate = driver.findElements(sort_lnk_state);
			for(WebElement e:sortstate){
				Thread.sleep(2000);
				System.out.println(e.getText());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void YesNoo() throws InterruptedException
	{
		POM_PubDefender pu=new POM_PubDefender(driver);
		 int YesNo=1;
			switch(YesNo)
			{
			case 1:
				Thread.sleep(1500);
				driver.findElement(By.id("btnYes")).click();
				Thread.sleep(1000);
				break;
			case 2:
				Thread.sleep(1500);
				driver.findElement(By.id("btnNo")).click();
				break;
			}	}
	
	public void NoYes() throws InterruptedException
	{
		POM_PubDefender pu=new POM_PubDefender(driver);
		 int YesNo=2;
			switch(YesNo)
			{
			case 1:
				Thread.sleep(1500);
				driver.findElement(By.id("btnYes")).click();
				Thread.sleep(1000);
				break;
			case 2:
				Thread.sleep(1500);
				driver.findElement(By.id("btnNo")).click();
				break;
			}	}
	public void VisitorReqForm(DataTable facility) throws InterruptedException
	{
		List<List<String>> fac=facility.raw();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_0']")).isDisplayed())
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_0']")).sendKeys(fac.get(16).get(1));
		}                              
		{
			//System.out.println("No RequestForm found");
		}
		List<WebElement> chk2=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl02$rblActiveStatus"));
		Boolean isSelected2=chk2.get(0).isSelected();
		
			if(isSelected2=true)
			{
				chk2.get(0).click();
			}
			else{
				chk2.get(1).click();
			}
	}
	
	public void PublicDefForm(DataTable facility) throws InterruptedException
	{
		List<List<String>> fac=facility.raw();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_1']")).isDisplayed())
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_1']")).sendKeys(fac.get(17).get(1));
		}                              
		{
			//System.out.println("No PDForm found");
		}
		Thread.sleep(1500);
		Select dd=new Select(driver.findElement(By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyCount_1")));
		dd.selectByValue("2");
		Thread.sleep(1000);
		Select dd1=new Select(driver.findElement(By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyType_1")));
		dd1.selectByValue("2");
		Thread.sleep(1500);
		List<WebElement> chk3=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl03$rblActiveStatus"));
		Boolean isSelected3=chk3.get(0).isSelected();
		
			if(isSelected3=true)
			{
				chk3.get(0).click();
			}
			else{
				chk3.get(1).click();
			}
	}
	
	public void PDS(DataTable facility) throws InterruptedException
	{
		List<List<String>> fac=facility.raw();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_2']")).isDisplayed())
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_2']")).sendKeys(fac.get(18).get(1));
		}                              
		{
			//System.out.println("No PDS found");
		}
				Thread.sleep(1000);
		List<WebElement> chk4=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl04$rblActiveStatus"));
		Boolean isSelected4=chk4.get(0).isSelected();
		
			if(isSelected4=true)
			{
				chk4.get(0).click();
			}
			else{
				chk4.get(1).click();
			}
	}
	public void RemedyForm(DataTable facility) throws InterruptedException
	{
		List<List<String>> fac=facility.raw();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_3']")).isDisplayed())
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_3']")).sendKeys(fac.get(19).get(1));
		}                              
		{
			//System.out.println("No RemedyForm found");
		}
		Thread.sleep(1500);
		Select dd=new Select(driver.findElement(By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyCount_3")));
		dd.selectByValue("2");
		Thread.sleep(1000);
		Select dd1=new Select(driver.findElement(By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyType_3")));
		dd1.selectByValue("2");
		Thread.sleep(1500);
		List<WebElement> chk5=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl05$rblActiveStatus"));
		Boolean isSelected5=chk5.get(0).isSelected();
		
			if(isSelected5=true)
			{
				chk5.get(0).click();
			}
			else{
				chk5.get(1).click();
			}
	}
	
			public void ReqForm1(DataTable facility) throws InterruptedException
			{
				List<List<String>> fac=facility.raw();
			Thread.sleep(2000);
			if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_4']")).isDisplayed())
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFormsInfo_txtFacilityRequestFormTitle_4']")).sendKeys(fac.get(20).get(1));
			}                              
			{
				//System.out.println("No RequestForm1 found");
			}
			Thread.sleep(1500);
			Select dd=new Select(driver.findElement(By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyCount_4")));
			dd.selectByValue("2");
			Thread.sleep(1000);
			Select dd1=new Select(driver.findElement(By.id("ContentPlaceHolder1_grvFormsInfo_ddlFrequencyType_4")));
			dd1.selectByValue("2");
			Thread.sleep(1500);
			List<WebElement> chk6=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFormsInfo$ctl06$rblActiveStatus"));
			Boolean isSelected6=chk6.get(0).isSelected();
			
				if(isSelected6=true)
				{
					chk6.get(0).click();
				}
				else{
					chk6.get(1).click();
				}
		}
			public void MsgToInmateForm1(DataTable facility) throws InterruptedException
			{
				List<List<String>> fac=facility.raw();
				Thread.sleep(2000);
				if(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gdvwManagementForm_txtFacilityManagementRequestFormTitle_0']")).isDisplayed())
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_gdvwManagementForm_txtFacilityManagementRequestFormTitle_0']")).sendKeys(fac.get(21).get(1));
				}                              
				{
					//System.out.println("No MsgToInmate Form found");
				}
				Thread.sleep(1500);
				List<WebElement> chk7=driver.findElements(By.name("ctl00$ContentPlaceHolder1$gdvwManagementForm$ctl02$rblManagementFormsActiveStatus"));
				Boolean isSelected7=chk7.get(0).isSelected();
				
					if(isSelected7=true)
					{
						chk7.get(0).click();
					}
					else{
						chk7.get(1).click();
					}
			}
			public void LockIndividualKiosk(DataTable facility) throws InterruptedException
			{
				List<List<String>> fac=facility.raw();
				Thread.sleep(1000);
				
				char AddDelete='A';
				 
					 switch(AddDelete)
					 {
					 case 'A'://Sunday
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkSunday']")).click();
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvSunday_txtFromInterval_0']")).sendKeys(fac.get(22).get(1));
						      Thread.sleep(1000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvSunday_txtToInterval_0']")).sendKeys(fac.get(23).get(1));
		                      Thread.sleep(1000);
		                      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvSunday_txtIntervalFor_0']")).sendKeys(fac.get(24).get(1));
		                      Thread.sleep(1000);
		                  /*    driver.findElement(By.xpath("//*[@id='btnAddNewRow']")).click();
		                      Thread.sleep(1000);*/
		                              //  DeleteSunday();
				          //	 break;
					 case 'B'://Monday
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkMonday']")).click();
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvMonday_txtFromInterval_0']")).sendKeys("01:00");
						      Thread.sleep(1000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvMonday_txtToInterval_0']")).sendKeys("01:15");
		                      Thread.sleep(1000);
		                      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvMonday_txtIntervalFor_0']")).sendKeys("Break time");
		                      Thread.sleep(1000);
//		                      driver.findElement(By.xpath("//*[@id='btnAddNewMondayRow']")).click();
//		                      Thread.sleep(1000);
		                              // DelMonday();
		                    //  break;  
					 case 'C'://Tuesday
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkTuesday']")).click();
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvTuesday_txtFromInterval_0']")).sendKeys("01:00");
						      Thread.sleep(1000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvTuesday_txtToInterval_0']")).sendKeys("01:15");
		                      Thread.sleep(1000);
		                      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvTuesday_txtIntervalFor_0']")).sendKeys("Break time");
		                      Thread.sleep(1000);
		                  //    driver.findElement(By.xpath("//*[@id='btnAddNewTuesdayRow']")).click();
		                                    // DelTuesday();
		                  //    break;                       
				    case 'D'://Wednesday
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkWedn']")).click();
						      Thread.sleep(2000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvWedn_txtFromInterval_0']")).sendKeys("01:00");
						      Thread.sleep(1000);
						      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvWedn_txtToInterval_0']")).sendKeys("01:15");
		                      Thread.sleep(1000);
		                      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvWedn_txtIntervalFor_0']")).sendKeys("Break time");
		                      Thread.sleep(1000);
		                 //     driver.findElement(By.xpath("//*[@id='btnAddNewWednesdayRow']")).click();
		                                  // DelWednesday();
		                  //    break;                       
					 case 'E'://Thursday
						 Thread.sleep(2000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkThurs']")).click();
					      Thread.sleep(2000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvThurs_txtFromInterval_0']")).sendKeys("01:00");
					      Thread.sleep(1000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvThurs_txtToInterval_0']")).sendKeys("01:15");
	                      Thread.sleep(1000);
	                      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvThurs_txtIntervalFor_0']")).sendKeys("Break time");
	                      Thread.sleep(1000);
	                  //    driver.findElement(By.xpath("//*[@id='btnAddNewThursdayRow']")).click();
	                                         // DelThurday();
	                    //  break;      
					
				case 'F'://Friday
						 Thread.sleep(2000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkFriday']")).click();
					      Thread.sleep(2000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFriday_txtFromInterval_0']")).sendKeys("01:00");
					      Thread.sleep(1000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFriday_txtToInterval_0']")).sendKeys("01:15");
	                     Thread.sleep(1000);
	                     driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvFriday_txtIntervalFor_0']")).sendKeys("Break time");
	                     Thread.sleep(1000);
	                 //    driver.findElement(By.xpath("//*[@id='btnAddNewFridayRow']")).click();
	                                  // DelFriday();
	                 //    break;                            
					 
				 case 'G'://SATURDAY
					      
						  Thread.sleep(2000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_chkSaturday']")).click();
					      Thread.sleep(1500);
					      scroll250();
					      Thread.sleep(2000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvSaturday_txtFromInterval_0']")).sendKeys("01:00");
					      Thread.sleep(1000);
					      driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvSaturday_txtToInterval_0']")).sendKeys("01:15");
	                     Thread.sleep(1000);
	                     driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grvSaturday_txtIntervalFor_0']")).sendKeys("Break time");
	                     Thread.sleep(1000);
	               //      driver.findElement(By.xpath("//*[@id='btnAddNewSaturdayRow']")).click();
	                                   //  DelSaturday();
	                  //   break;     
						                        
					 }
					 int x=1;
					 switch(x)
					 {
					 case 1:
						 Thread.sleep(1000);
						 driver.findElement(btn_save).click();
						 Thread.sleep(2000);
						 driver.findElement(By.id("btnOk")).click();
						 break;
					 case 2:
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("ContentPlaceHolder1_btnCancel")).click();
						 break;
					 }
					 
					
			} 
			
			public void DeleteSunday() throws InterruptedException
			{
				 Thread.sleep(1500);
				 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDelete']")).click();	
				    Thread.sleep(1000);
				    driver.findElement(By.id("btnOk")).click();
				 /*   List<WebElement>DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvSunday$ctl02$chkDelete"));
                 for(int i=0;i<DelFri.size();i++)
                 {
                 	Thread.sleep(1000);
                 	DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvSunday$ctl02$chkDelete"));
                 	Thread.sleep(1000);
                 	DelFri.get(0).click();
                 }*/
				    for(int i=0;i<1;i++)
				    {
				    Thread.sleep(1000);
				    driver.findElement(By.id("ContentPlaceHolder1_grvSunday_chkDelete_"+i+"")).click();
				    }
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDelete']")).click();	
                 NoYes();
			}
			public void DelMonday() throws InterruptedException
			{
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteMon']")).click();	
			    Thread.sleep(2000);
			    driver.findElement(By.id("btnOk")).click();
			    Thread.sleep(1000);
			  /*  List<WebElement>DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvMonday$ctl02$chkDelete"));
                for(int i=0;i<DelFri.size();i++)
                {
                	Thread.sleep(1000);
                	DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvMonday$ctl02$chkDelete"));
                	Thread.sleep(1000);
                	DelFri.get(0).click();
                }*/
			    for(int i=0;i<1;i++)
			    {
			    Thread.sleep(1000);
			    driver.findElement(By.id("ContentPlaceHolder1_grvMonday_chkDelete_"+i+"")).click();
			    }
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteMon']")).click();	
                NoYes();
			}
			public void DelTuesday() throws InterruptedException
			{
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteTues']")).click();	
			    Thread.sleep(1000);
			    driver.findElement(By.id("btnOk")).click();
			    Thread.sleep(1000);
			  /*  List<WebElement>DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvTuesday$ctl02$chkDelete"));
                for(int i=0;i<DelFri.size();i++)
                {
                	Thread.sleep(1000);
                	DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvTuesday$ctl02$chkDelete"));
                	Thread.sleep(1000);
                	DelFri.get(0).click();
                }*/
			    for(int i=0;i<1;i++)
			    {
			    Thread.sleep(1000);
			    driver.findElement(By.id("ContentPlaceHolder1_grvTuesday_chkDelete_"+i+"")).click();
			    }
			   
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteTues']")).click();	
                NoYes();
			}
			public void DelWednesday() throws InterruptedException
			{
				    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteWed']")).click();	
				    Thread.sleep(1000);
				    driver.findElement(By.id("btnOk")).click();
				    Thread.sleep(1000);
				    for(int i=0;i<1;i++)
				    {
				    Thread.sleep(1000);
				    driver.findElement(By.id("ContentPlaceHolder1_grvWedn_chkDelete_"+i+"")).click();
				    }
                 Thread.sleep(1000);
                 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteWed']")).click();	
                 NoYes();
	}
	public void DelThurday() throws InterruptedException
	{
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteThues']")).click();	
	    Thread.sleep(1000);
	    driver.findElement(By.id("btnOk")).click();
	    Thread.sleep(1000);
	    for(int i=0;i<1;i++)
	    {
	    Thread.sleep(1000);
	    driver.findElement(By.id("ContentPlaceHolder1_grvThurs_chkDelete_"+i+"")).click();
	    }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteThues']")).click();	
        NoYes();
	}
	public void DelFriday() throws InterruptedException
	{
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteFri']")).click();	
	    Thread.sleep(1000);
	    driver.findElement(By.id("btnOk")).click();
	    Thread.sleep(1000);
	   /* List<WebElement>DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFriday$ctl03$chkDelete"));
        for(int i=0;i<DelFri.size();i++)
        {
        	Thread.sleep(1000);
        	DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvFriday$ctl03$chkDelete"));
        	Thread.sleep(1000);
        	DelFri.get(0).click();
        }*/
	    for(int i=0;i<1;i++)
	    {
	    Thread.sleep(1000);
	    driver.findElement(By.id("ContentPlaceHolder1_grvFriday_chkDelete_"+i+"")).click();
	    }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteFri']")).click();	
        NoYes();
   }
	public void DelSaturday() throws InterruptedException
	{
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteSatur']")).click();	
	    Thread.sleep(1000);
	    driver.findElement(By.id("btnOk")).click();
	    Thread.sleep(1000);
	   /* List<WebElement>DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvSaturday$ctl02$chkDelete"));
        for(int i=0;i<DelFri.size();i++)
        {
        	Thread.sleep(1000);
        	DelFri=driver.findElements(By.name("ctl00$ContentPlaceHolder1$grvSaturday$ctl02$chkDelete"));
        	Thread.sleep(1000);
        	DelFri.get(0).click();
        }*/
	    for(int i=0;i<1;i++)
	    {
	    Thread.sleep(1000);
	    driver.findElement(By.id("ContentPlaceHolder1_grvSaturday_chkDelete_"+i+"")).click();
	    }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnDeleteSatur']")).click();	
        NoYes();
	}
	public void EditFacility(DataTable facility) throws InterruptedException
	{
		List<List<String>> fac=facility.raw();
		int randomInt5;
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFacilityCodeSearch']")).clear();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFacilityCodeSearch']")).sendKeys("Cod");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtCitySearch']")).clear();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtCitySearch']")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFacilityNameSearch']")).clear();
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtFacilityNameSearch']")).sendKeys("fac");
		/*Thread.sleep(1300);
		Select state=new Select(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlStateSearch']")));
		state.selectByVisibleText("Alaska");
		Thread.sleep(1500);
		Select Status=new Select(driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlActiveStatus']")));
		Status.selectByVisibleText("Active");*/
		Thread.sleep(1000);
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(1000);
		/*List<WebElement> code=driver.findElements(By.id("lnkFacilityID"));
		for(int i=0;i<code.size();i++)
		{
			Thread.sleep(1000);
			code=driver.findElements(By.id("lnkFacilityID"));
			Thread.sleep(1000);
			code.get(0).click();
		}
		
		*/
		driver.findElement(By.linkText("Code888")).click();
		Random rd5 = new Random();
		for (int x = 100; x <= 1000; ++x) {
			randomInt5 = rd5.nextInt(1001);		
		}
		Thread.sleep(1000);
		driver.findElement(txt_email).clear();
		driver.findElement(txt_email).sendKeys(fac.get(2).get(1)+randomInt2+fac.get(2).get(2)); 
		Thread.sleep(1000);
		driver.findElement(txt_phone).clear();
		driver.findElement(txt_phone).sendKeys(fac.get(3).get(1));
		logger.info("Phone number has been entered");
		Thread.sleep(1000);
		driver.findElement(txt_address).clear();
		driver.findElement(txt_address).sendKeys(fac.get(4).get(1));
		logger.info("Facility address has been entered");
		/*scroll();
		Thread.sleep(2000);*/
		Thread.sleep(1000);
		driver.findElement(By.id("ContentPlaceHolder1_txtCity")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_txtCity")).sendKeys(fac.get(5).get(1));
		Thread.sleep(1000);
		Select state_1 = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlState")));
		state_1.selectByVisibleText(fac.get(6).get(1));
		logger.info("State has chosen");
		Thread.sleep(1000);	
		driver.findElement(By.id("ContentPlaceHolder1_txtZipCode")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_txtZipCode")).sendKeys(fac.get(7).get(1));
		Thread.sleep(1500);
		scroll250();
		/*driver.findElement(chk_message).click();
		logger.info("Message checkbox chosen successfully");
		Thread.sleep(1000);		
		driver.findElement(chk_document).click();
		logger.info("Document checkbox chosen successfully");
		Thread.sleep(1000);		
		driver.findElement(chk_photo).click();
		logger.info("Photo checkbox chosen successfully");
		Thread.sleep(1000);		
		driver.findElement(chk_request).click();
		logger.info("Request checkbox chosen successfully");
		Thread.sleep(1000);
		driver.findElement(chk_commissary).click();
		logger.info("Commissary checkbox chosen successfully");
		Thread.sleep(2000);		
		driver.findElement(txt_commissary).sendKeys(fac.get(8).get(1));
		logger.info("Commissary textbox entered successfully");
		Thread.sleep(1500);
		driver.findElement(chk_lawlibrary).click();
		logger.info("Lawlibrary checkbox chosen successfully");*/
	
		Thread.sleep(1500);
		Select freq=new Select(driver.findElement(By.id("ddlCreditFrequency")));
		freq.selectByValue("2");
		Thread.sleep(1000);
		Select cred=new Select(driver.findElement(By.id("ddlFreeCredits")));
		cred.selectByValue("2");
		Thread.sleep(1000);
		/*List<WebElement> chk=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rblFacilityStatus"));
		Boolean isSelected=chk.get(0).isSelected();
		
			if(isSelected=true)
			{
				chk.get(0).click();
			}
			else{
				chk.get(1).click();
			}*/
		    Thread.sleep(1500);
		//    driver.findElement(By.id("ContentPlaceHolder1_chkInvitePublicUser")).click();
		    Thread.sleep(1500);
		    scroll250();
		    Thread.sleep(1500);
			Select frequency=new Select(driver.findElement(By.id("ddlFrequencyType")));
			frequency.selectByValue("2");
			Thread.sleep(1000);
			driver.findElement(By.id("ContentPlaceHolder1_txtFrequencyLimits")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_txtFrequencyLimits")).sendKeys(fac.get(10).get(1));
			Thread.sleep(1000);
			driver.findElement(By.id("ContentPlaceHolder1_txtLimitsPerSource")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_txtLimitsPerSource")).sendKeys(fac.get(11).get(1));
			Thread.sleep(1000);
			List<WebElement> chk1=driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdoInvitePublicUserStatus"));
		
				Boolean isSelected1;
				try {
					isSelected1 = chk1.get(0).isSelected();
				} catch (StaleElementReferenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					if(isSelected1=true)
					{
						chk1.get(0).click();
					}
					else{
						chk1.get(1).click();
					}
			
				Thread.sleep(2000);
				scroll350();
				/*driver.findElement(By.id("ContentPlaceHolder1_txtLawLibraryUrl")).sendKeys("http://inmatecr01.sgssys.info/Admin/AddFacility.aspx");
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_txtCommisaryUrl")).sendKeys("http://inmatecr01.sgssys.info/Admin/AddFacility.aspx");
				Thread.sleep(1000);*/
				Thread.sleep(2000);
			
			/*	driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_0")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_1")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_2")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_3")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("ContentPlaceHolder1_cblAvailableForms_4")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("ContentPlaceHolder1_cblManagementAvailableForms_0")).click();
				Thread.sleep(1500);
		driver.findElement(btn_Addform).click();
		Thread.sleep(2000);					
		YesNoo();
		Thread.sleep(1500);
	
		VisitorReqForm(facility);
		
		PublicDefForm(facility);
		
		PDS(facility);
		
		RemedyForm(facility);
		
		ReqForm1(facility);
		scroll250();
		MsgToInmateForm1(facility);*/
		scroll();
		Thread.sleep(2000);
		driver.findElement(txt_server_url).clear();
		driver.findElement(txt_server_url).sendKeys(fac.get(12).get(1));
		logger.info("Server url has been entered");
		Thread.sleep(1000);	
		driver.findElement(txt_filepath).clear();
		Random rd6 = new Random();
		for (int x = 1111; x <=9998; ++x) {
			randomInt6 = rd6.nextInt(9999);		
		}
		Thread.sleep(1000);
		driver.findElement(txt_filepath).clear();
		driver.findElement(txt_filepath).sendKeys(fac.get(13).get(1)+randomInt3+".txt");
		logger.info("File path has been entered");
		Thread.sleep(1000);	
		driver.findElement(txt_username).clear();
		driver.findElement(txt_username).sendKeys(fac.get(14).get(1));
		logger.info("Username has been entered");
		Thread.sleep(1000);
		driver.findElement(txt_password).clear();
		driver.findElement(txt_password).sendKeys(fac.get(15).get(1));
		Thread.sleep(1000);
		scroll();
		scroll();
		int x=1;
		 switch(x)
		 {
		 case 1:
			 Thread.sleep(1500);
			 driver.findElement(btn_save).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("btnOk")).click();
			 break;
		 case 2:
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCancel']")).click();
			 break;
		 }
		 
	}
	
	}

