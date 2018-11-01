package AdminLogin_Inmate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.POM_PubDefender;
import cucumber.api.DataTable;

public class Publicuser_Page {

	public WebDriver driver;

	public Publicuser_Page(WebDriver driver) {
		this.driver = driver;
	}

	By lnk_Publicuser = By.id("rptUser_menuAnchor_10");
	By txt_username_search = By.id("ContentPlaceHolder1_txtUserNameSearch");
	By btn_search = By.id("btnSearch");
	By export_excel = By.id("ContentPlaceHolder1_imbtnExportToExcel");
	By lnk_username = By.id("lblUserName");
	By pagination = By
			.xpath("//*[@id='grvUsers']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");
	By dwn_Category = By.id("ContentPlaceHolder1_ddlChoose");
	By chk_connection = By.id("chkSelectPublicUsers");
	By txtarea_notes = By.id("ContentPlaceHolder1_txtNotes");
	By btn_update = By.xpath("//*[@id='btnSubmit']");
	By dwn_inmate_id = By.name("ctl00$ContentPlaceHolder1$ddlLoadInmates");
	By txt_complementary_fund = By.id("ContentPlaceHolder1_txtCredits");
	By btn_submit = By.id("btnFundSubmit");
	By btn_ok = By.id("btnOk");
	By export_excel_connection = By
			.id("ContentPlaceHolder1_imgbtnConnectionsInfoExporttoExcel");
	By sort_inmate_id = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[2]/a");
	By sort_inmate_name = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[3]/a");
	By sort_inmate_status = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[4]/a");
	By sort_relationship = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[5]/a");
	By sort_connection_status = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[6]/a");
	By sort_credit_balance = By
			.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[7]/a");
	By connection_pagination = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[12]/td/table/tbody/tr/td[2]/a");
	By lnk_messages = By
			.xpath("//*[@id='ContentPlaceHolder1_anchrMessages']/i/span");
	By lnk_photos = By.id("ContentPlaceHolder1_anchrPhotos");
	By lnk_payments = By.id("ContentPlaceHolder1_achrPayments");
	By msg_edit_sub = By.id("lblMessageSubject");
	By msg_translate = By.id("lnkbtnTranslate");
	By msg_back = By.id("ContentPlaceHolder1_btnBack");
	By lnk_browser = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[1]/a");
	By lnk_ip_address = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[2]/a");
	By lnk_datetime = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[3]/a");
	By photo_edit_sub = By.id("lblPhotoSubject");
	By btn_payment_back = By.id("ContentPlaceHolder1_btnPaymentsBack");
	By lnk_Ipaddress = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[2]/a");
	By lnk_DateTime = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[1]/th[3]/a");
	By export_login_info = By
			.id("ContentPlaceHolder1_imgbtnUsersLoginInfoExporttoExcel");
	By login_info_pagination = By
			.xpath("//*[@id='grvPublicUsersLoginInfo']/tbody/tr[12]/td/table/tbody/tr/td[4]/a");

	By Reports = By.xpath("//*[@id='ContentPlaceHolder1_achrReports']/i/span");
	By FromDate = By.id("ContentPlaceHolder1_txtReportFromDate");
	By ToDate = By.id("ContentPlaceHolder1_txtReportToDate");
	By Direction = By.id("ContentPlaceHolder1_ddlReportMessageDirection");
    By Notes=By.xpath("//*[@id='ContentPlaceHolder1_txtNotes']");
    By category=By.xpath("//*[@id='ContentPlaceHolder1_ddlChoose']");
    By inmateId=By.xpath("//*[@id='ContentPlaceHolder1_ddlLoadInmates']");
    By CompFunds=By.xpath("//*[@id='ContentPlaceHolder1_txtCredits']");
    By submit=By.xpath("//*[@id='btnFundSubmit']");
    
    
	public void publicuser_edit(DataTable puReport) throws Exception {


			Logger Log = Logger.getLogger("Login_Page");
			PropertyConfigurator.configure("log4j.properties");
			Thread.sleep(1000);
			driver.findElement(lnk_Publicuser).click();
			Log.info("Public User Menu clicked");
			Select sel = new Select(driver.findElement(By
					.id("ddlFacilityCodes")));
			sel.selectByValue("105");
			Log.info("Facility code has been chosen");
			Thread.sleep(2000);
			driver.findElement(txt_username_search).sendKeys("mangai");
			Log.info("Username has been entered");
			driver.findElement(btn_search).click();
			Log.info("Search button has clicked");
		    Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUsers_lblUserName_2']")).click();
			
			Log.info("Username has been clicked");
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			scroll();
			/*Thread.sleep(1000);
			List<WebElement> chkbox = driver.findElements(By.xpath("//*[@id='chkSelectPublicUsers']"));
			int isize = chkbox.size();
			// System.out.println("Total Size of checkbox"+isize);
			for (int j = 0; j < isize; j++) {
				chkbox = driver.findElements(By.xpath("//*[@id='chkSelectPublicUsers']"));
				Thread.sleep(1000);
				chkbox.get(0).click();
			}*/
			
			Log.info("Inmate id has been clicked");
			Thread.sleep(1000);
		    driver.findElement(Notes).clear();
		    driver.findElement(Notes).sendKeys("Test Notessss");
		    Thread.sleep(2000);
			driver.findElement(btn_update).click();
			Log.info("Update button clicked");
			Thread.sleep(1000);
			driver.findElement(btn_ok).click();
			Log.info("Ok button has been clicked");
			
		    FundingProcess();
		  
			Thread.sleep(1500);
			 driver.findElement(export_excel_connection).click();
			Log.info("Export to Excel_Connections has been clicked");
            Thread.sleep(1000);
            scroll450();
            Thread.sleep(1000);
			Sorting_Connections();
			Thread.sleep(1000);
			Block();
			Thread.sleep(1000);
			scroll();
			Thread.sleep(1000);
			Login_Information();
			POM_PubDefender pu = new POM_PubDefender(driver);
			Thread.sleep(2000);
		   // pu.PublicUsers.click();
			scroll2000();
			Thread.sleep(2500);
			pu.PubUserMessage.click();
			Thread.sleep(2000);
			pu.InmateLastNameSearch.click();
			Thread.sleep(1000);
			pu.InmateAutoLastName.sendKeys("JoHN");
			Thread.sleep(1000);
			Robot r4 = new Robot();
			r4.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			pu.InmateFirstNameSearch.click();
			Thread.sleep(1000);
			pu.InmateAutoFirstName.sendKeys("PETER");
			Thread.sleep(1000);
			Robot r5 = new Robot();
			r5.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			pu.SearchMsg.click();
			Thread.sleep(1000);
			Thread.sleep(1500);
			driver.findElement(	By.xpath("//*[@id='ContentPlaceHolder1_rptMessages_lblSubject_0']")).click();
			Thread.sleep(1500);
			pu.BtnTranslate.click();
			Thread.sleep(1500);
			pu.Back.click();
			Thread.sleep(1000);
			scroll450();
			Thread.sleep(1000);
			pu.Message_Sorting();

	       	 PublicUser_photos();
		
			Thread.sleep(2000);
			Payments();
				
			Thread.sleep(1000);

			Pub_User_reports(puReport);

	}
	public void Payments() throws InterruptedException
			{
		        Thread.sleep(1000);
				scroll200();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_achrPayments']/i/span")).click();
				Thread.sleep(2000);
				for(int i=0;i<3;i++)
				{
					Thread.sleep(1500);
					driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNextPay']")).click();
				}
				Thread.sleep(1500);
				for(int i=0;i<3;i++)
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPrevious']")).click();
				}
			}
	public void Login_Information() throws Exception
	{
		/*System.out.println("SignIn browser Type Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninBrowserType']")).click();
		Sorting_SignInBrowser();
		System.out.println("SignIn browser Type Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninBrowserType']")).click();
		Thread.sleep(1000);
		Sorting_SignInBrowser();
		
		System.out.println("SignIn IP Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninIPAddress']")).click();
   	    Sorting_SignInIpAddress();
		System.out.println("SignIn IP Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninIPAddress']")).click();
		Thread.sleep(1000);
		Sorting_SignInIpAddress();*/
		
		System.out.println("SiginIn on Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninOn']")).click();
   	    Sorting_SigninOn();
		System.out.println("Inmate ID Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lnkSigninOn']")).click();
		Thread.sleep(1000);
		Sorting_SigninOn();
		
		Thread.sleep(1000);
		Pagination();
	}
	public void Pagination() throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPULoginInfoNext']")).click();
		}
		Thread.sleep(1000);
		for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnPULoginInfoPrev']")).click();
		}
	}
	public void Block() throws InterruptedException
	{
		Thread.sleep(1000);
		List<WebElement> chk=driver.findElements(By.id("chkSelectPublicUsers"));
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1000);
			chk=driver.findElements(By.id("chkSelectPublicUsers"));
			Thread.sleep(1000);
			chk.get(0).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='btnUpdatePublicUser']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='btnOk']")).click();
	}
public void FundingProcess() throws InterruptedException
{
	    Thread.sleep(2000);
	    Select Cate=new Select(driver.findElement(category));
	    Cate.selectByVisibleText("Complementary Fund");
	    Thread.sleep(1500);
	    Select inmate_id=new Select(driver.findElement(inmateId));
	    inmate_id.selectByIndex(1);
	    Thread.sleep(1000);
	    driver.findElement(CompFunds).sendKeys("0");
	    Thread.sleep(1000);
	    driver.findElement(submit).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='btnOk']")).click();
	    Thread.sleep(1000);
	    driver.findElement(CompFunds).clear();
	    driver.findElement(CompFunds).sendKeys("0.02");
	    Thread.sleep(1000);
	    driver.findElement(submit).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='btnOk']")).click();
}
	/* code for scroll */
	private void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,650)");
		Thread.sleep(1000);
	}

	private void scroll1() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,-1700)");
	}
	private void scroll2000() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,-2000)");
	}
	private void scroll200() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,-200)");
	}
	private void scroll450() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(0,450)");
	}

	/* code for explicit wait */
	public void webdriverWait(By locator, long sec) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void Sorting_Inmate_ID() throws Exception {

		 Thread.sleep(1000);
		 By list11 = By.id("lblInmateResidentId");
		 Thread.sleep(1000);
		 List<WebElement> myElements = driver.findElements(list11);
		 for (WebElement e : myElements) {
			System.out.println(e.getText());
		}
	
	}
    public void Sorting_Connections() throws Exception
    {
    	
    	System.out.println("Inmate ID Ascending order");
    	Thread.sleep(2000);
   	    driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[2]/a")).click();
		Sorting_Inmate_ID();
		System.out.println("Inmate ID Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[2]/a")).click();
		Thread.sleep(1000);
		Sorting_Inmate_ID();
		
		System.out.println("Inmate Name Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[3]/a")).click();
   	    Sorting_Inmate_Name();
		System.out.println("Inmate Name Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[3]/a")).click();
		Thread.sleep(1000);
		Sorting_Inmate_Name();
		
		System.out.println("Inmate Status Ascending order");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[4]/a")).click();
   	    Sorting_Inmate_Status();
		System.out.println("Inmate Status Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[4]/a")).click();
		Thread.sleep(1000);
		Sorting_Inmate_Status();
		
		System.out.println("Inmate Relationship Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[5]/a")).click();
   	    Sorting_Inmate_Relationship();
		System.out.println("Inmate Relationship Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[5]/a")).click();
		Thread.sleep(1000);
		Sorting_Inmate_Relationship();
		
		System.out.println("Inmate ConnStatus Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[6]/a")).click();
   	    Sorting_Inmate_Connection_Status();
		System.out.println("Inmate ConnStatus Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[6]/a")).click();
		Thread.sleep(1000);
		Sorting_Inmate_Connection_Status();
		
		System.out.println("Inmate Credit Balance Ascending order");
    	Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[7]/a")).click();
   	    Sorting_Inmate_Credit_Balance();
		System.out.println("Inmate Credit Balance Descending order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='grvPublicUsersInfo']/tbody/tr[1]/th[7]/a")).click();
		Thread.sleep(1000);
		Sorting_Inmate_Credit_Balance();
    }
	public void Sorting_Inmate_Name() throws Exception {
		Thread.sleep(1000);
		By list11 = By.id("lblInmateName");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_SignInBrowser() throws Exception {
		Thread.sleep(1500);
		for(int i=0;i<1;i++)
		{
		By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lblSigninBrowserType_"+i+"']");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}}
	}
	public void Sorting_SignInIpAddress() throws Exception {
		Thread.sleep(1500);
		for(int i=0;i<1;i++)
		{
		By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lblSigninIPAddress_"+i+"']");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}}
	}
	public void Sorting_SigninOn() throws Exception {
		Thread.sleep(1000);
		for(int i=0;i<1;i++)
		{                      
		By list11 = By.xpath("//*[@id='ContentPlaceHolder1_rptPublicUserLoginInfo_lblSigninDateTime_"+i+"']");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}}
	}
	
	public void Sorting_Inmate_Relationship() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblRelationShip");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());

		}
	}
	public void Sorting_Inmate_Status() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblInmateStatus");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());

		}
	}
	public void Sorting_Inmate_Connection_Status() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblConnectionStatus");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());

		}
	}

	public void Sorting_Inmate_Credit_Balance() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblCreditBalance");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_browser() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblSigninBrowserType");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_IpAdress() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblSigninIPAddress");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Sorting_Datetime() throws Exception {

		Thread.sleep(1000);
		// driver.findElement(page_sort).click();
		By list11 = By.id("lblSigninDateTime");
		List<WebElement> myElements = driver.findElements(list11);
		for (WebElement e : myElements) {
			Thread.sleep(1000);
			System.out.println(e.getText());
		}
	}

	public void Pub_User_reports(DataTable puReport)
			throws InterruptedException {
		List<List<String>> report = puReport.raw();
		Thread.sleep(2000);
		driver.findElement(Reports).click();
		Thread.sleep(1000);
		driver.findElement(FromDate).sendKeys(report.get(0).get(1));
		Thread.sleep(1000);
		driver.findElement(ToDate).sendKeys(report.get(1).get(1));
		Thread.sleep(1000);
		Select dir = new Select(driver.findElement(Direction));
		dir.selectByVisibleText(report.get(2).get(1));
		Thread.sleep(1000);
		driver.findElement(By.id("btnMessagesDownload")).click();
		Thread.sleep(1000);
		int x=1;
		switch(x)
		{
		case 1:
			Thread.sleep(1000);
			driver.findElement(By.id("btnDownloadMessages")).click();
			break;
		case 2:
			Thread.sleep(1000);
			driver.findElement(By.id("btnMessageCancelDownload")).click();
			break;
		}
	}

	public void PublicUser_photos()
			throws Exception {
		
		POM_PubDefender pu = new POM_PubDefender(driver);
		Thread.sleep(1500);
		ScrollDown450();
		Thread.sleep(2000);
		pu.PubUserPhotos.click();
		Thread.sleep(2000);
		pu.InmateLastSearch.click();
		Thread.sleep(1000);
		pu.InmateAutoLastSearch.sendKeys("JoHN");
		Thread.sleep(1000);
		Robot r4 = new Robot();
		r4.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		pu.InmateFrstSearch.click();
		Thread.sleep(1000);
		pu.InmateAutoFrstSearch.sendKeys("PETER");
		Thread.sleep(1000);
		Robot r5 = new Robot();
		r5.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1300);
		/*
		 * Select ststus=new Select(pu.SearchStatus); ststus.selectByValue("4");
		 */
		Thread.sleep(1000);
		pu.btnSearchPhotos.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ScrollUp250();
		
		Photos_Sort();
		
		/*pu.PublicUser_Photos_Subject_Sort();
		pu.PublicUser_Photos_From_Sort1();
	    pu.PublicUser_Photos_To_Sort();
		pu.PublicUser_Photos_SentOn_Sort();
		pu.PublicUser_Photos_Status_Sort();*/

	}
	public void Pagination_photos() throws InterruptedException
	{
	/*	for(int i=0;i<4;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNextPh']")).click();
		}*/
		List<WebElement> pag =driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNextPh']"));

		pag.size(); 
		System.out.println(pag.size()); 
		if(pag .size()>0){ 
		System.out.println("pagination exists");

		// click on pagination link

		for(int i=0; i<pag.size(); i++){ 
			
			Thread.sleep(1000);
			pag =driver.findElements(By.xpath("//*[@id='ContentPlaceHolder1_imgbtnNextPh']"));
			Thread.sleep(1000);
			pag.get(i).click();

		} 
		} else { 
		System.out.println("pagination not exists"); 
		} 
		}
public void Photos_Sort() throws Exception
{
	POM_PubDefender pu = new POM_PubDefender(driver);
	System.out.println("Photos Subj Ascending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSubject']")).click();
	pu.PublicUser_Photos_Subject_Sort1();
	System.out.println("Photos Subj Descending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSubject']")).click();
	Thread.sleep(1000);
	pu.PublicUser_Photos_Subject_Sort1();
	
	System.out.println("Photos from Ascending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkFrom']")).click();
	pu.PublicUser_Photos_From_Sort1();
	System.out.println("Photos from Descending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkFrom']")).click();
	Thread.sleep(1000);
	pu.PublicUser_Photos_From_Sort1();

	System.out.println("Photos to Ascending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkTo']")).click();
	pu.PublicUser_Photos_To_Sort1();
	System.out.println("Photos to Descending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkTo']")).click();
	Thread.sleep(1000);
	pu.PublicUser_Photos_To_Sort1();
	
	System.out.println("Photos SentOn Ascending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSentOn']")).click();
	pu.PublicUser_Photos_SentOn_Sort1();
	System.out.println("Photos SentOn Descending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkSentOn']")).click();
	Thread.sleep(1000);
	pu.PublicUser_Photos_SentOn_Sort1();
	
	System.out.println("Photos Status Ascending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkStatus']")).click();
	pu.PublicUser_Photos_Status_Sort1();
	System.out.println("Photos Status Descending order");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rptPhotosInfo_lnkStatus']")).click();
	Thread.sleep(1000);
	pu.PublicUser_Photos_Status_Sort1();
}
	public void ScrollDown450() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
	}

	public void ScrollUp250() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
}
